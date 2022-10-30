package desafio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio.model.enderecoPessoa;
import desafio.model.enderecoPessoaRepository;
import desafio.model.pessoa;
import desafio.model.pessoaRepository;
@Service
public class pessoaServiceImpl implements pessoaService {
	
	@Autowired
	private pessoaRepository pessoaRepository;
	
	@Autowired
	private enderecoPessoaRepository enderecoPessoaRepository;
	
	@Autowired
	private enderecoPessoaService enderecoPessoaService;
	
	

	@Override
	public Iterable<pessoa> buscarTodos() {
  
		return pessoaRepository.findAll();
	}

	@Override
	public pessoa buscarPorId(Long id) {
		
	     Optional<pessoa> pessoFisicaid =  pessoaRepository.findById(id);	 
		 return pessoFisicaid.get() ;
	}

	@Override
	public void inserir(pessoa pessoa) {
		
		salvarPessoaComCep(pessoa);
		
	}

	@Override
	public void atualizar(Long id, pessoa pessoa) {
		
		Optional<pessoa> pessoaID = pessoaRepository.findById(id);
		if(pessoaID.isPresent()) {
			
			salvarPessoaComCep(pessoa);
		}
	}

	@Override
	public void deletar(Long id) {
		
		pessoaRepository.deleteById(id);
		
	}
	
	private void salvarPessoaComCep (pessoa pessoa) {
		
		String cep = pessoa.getEndereco().getCep();
		enderecoPessoa enderecoPessoa = enderecoPessoaRepository.findById(cep).orElseGet(() -> {
			
			enderecoPessoa novoEndereco = enderecoPessoaService.consultarCep(cep);
			enderecoPessoaRepository.save(novoEndereco);
			return novoEndereco;
			
		});
		
		pessoa.setEndereco(enderecoPessoa);
	    pessoaRepository.save(pessoa);
		
		
	}
	

}
