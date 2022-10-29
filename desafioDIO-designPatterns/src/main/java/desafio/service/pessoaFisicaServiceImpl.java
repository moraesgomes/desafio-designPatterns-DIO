package desafio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio.model.dadosPessoaFisica;
import desafio.model.dadosPessoaFisicaRepository;
import desafio.model.pessoaFisica;
import desafio.model.pessoaFisicaRepository;

@Service
public class pessoaFisicaServiceImpl implements pessoaFisicaService {
	
	@Autowired
	private pessoaFisicaRepository pessoaFisicaRepository;
	
	@Autowired
	private dadosPessoaFisicaRepository dadosPessoaFisicaRepository;
	
	@Autowired
	private dadosPessoaFisicaService dadosPessoaFisicaService;
	
	

	@Override
	public Iterable<pessoaFisica> buscarTodos() {
  
		return pessoaFisicaRepository.findAll();
	}

	@Override
	public pessoaFisica buscarPorId(Long id) {
		
	     Optional<pessoaFisica> pessoFisicaid =  pessoaFisicaRepository.findById(id);	 
		 return pessoFisicaid.get() ;
	}

	@Override
	public void inserir(pessoaFisica pessoa) {
		
		salvarPessoaComCpf(pessoa);
		
	}

	@Override
	public void atualizar(Long id, pessoaFisica pessoa) {
		
		Optional<pessoaFisica> pessoaID = pessoaFisicaRepository.findById(id);
		if(pessoaID.isPresent()) {
			
			salvarPessoaComCpf(pessoa);
		}
	}

	@Override
	public void deletar(Long id) {
		
		pessoaFisicaRepository.deleteById(id);
		
	}
	
	private void salvarPessoaComCpf (pessoaFisica pessoaFisica) {
		
		String cpf = pessoaFisica.getCpf().getCpf();
		dadosPessoaFisica dadosPessoaFisica = dadosPessoaFisicaRepository.findById(cpf).orElseGet(() -> {
			
			dadosPessoaFisica novaPessoa = dadosPessoaFisicaService.consultarCpf(cpf);
			dadosPessoaFisicaRepository.save(novaPessoa);
			return novaPessoa;
			
		});
		
		
	}
	

}
