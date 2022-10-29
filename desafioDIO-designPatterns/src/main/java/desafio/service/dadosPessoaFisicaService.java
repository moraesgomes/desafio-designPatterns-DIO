package desafio.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import desafio.model.dadosPessoaFisica;


@FeignClient(name ="sintegraws" , url = "https://www.sintegraws.com.br/api/v1/execute-api.php" )
public interface dadosPessoaFisicaService {
	
	
  @GetMapping("/{cpf}/json")	
  dadosPessoaFisica consultarCpf(@PathVariable("cpf") String cpf);
	
}
