package desafio.service;

import desafio.model.pessoaFisica;

public interface pessoaFisicaService {

	Iterable<pessoaFisica> buscarTodos();
	
	pessoaFisica buscarPorId(Long id);
	
	void inserir(pessoaFisica pessoa);
	
	void atualizar(Long id, pessoaFisica pessoa);
	
	void deletar(Long id);
	
}
