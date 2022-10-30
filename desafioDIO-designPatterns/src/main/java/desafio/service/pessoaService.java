package desafio.service;

import desafio.model.pessoa;


public interface pessoaService{
  
  Iterable<pessoa> buscarTodos();
	
	pessoa buscarPorId(Long id);
	
	void inserir(pessoa pessoa);
	
	void atualizar(Long id, pessoa pessoa);
	
	void deletar(Long id);
	
}
