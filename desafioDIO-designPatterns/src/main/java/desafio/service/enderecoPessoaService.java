package desafio.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import desafio.model.enderecoPessoa;


@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface enderecoPessoaService {

	
	
		
		
	  @GetMapping("/{cpf}/json")	
	  enderecoPessoa consultarCep(@PathVariable("cep") String cep);
	
}
