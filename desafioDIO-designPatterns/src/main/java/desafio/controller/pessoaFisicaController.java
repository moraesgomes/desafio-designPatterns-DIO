package desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.model.pessoaFisica;
import desafio.service.pessoaFisicaService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("pessoas")
public class pessoaFisicaController {
	
	@Autowired
	private pessoaFisicaService pessoaFisicaService;
	
	@GetMapping
	public ResponseEntity<Iterable<pessoaFisica>>buscarTodos(){
		
		return ResponseEntity.ok(pessoaFisicaService.buscarTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<pessoaFisica> buscarPorId(@PathVariable Long id){
		
		return ResponseEntity.ok(pessoaFisicaService.buscarPorId(id));
	}

	@PostMapping
	public ResponseEntity<pessoaFisica> inserir (@RequestBody pessoaFisica pessoaFisica){
		
		pessoaFisicaService.inserir(pessoaFisica);
		
		return ResponseEntity.ok(pessoaFisica);
	}
	
	@PutMapping
	public ResponseEntity<pessoaFisica> atualizar(@PathVariable   Long id,@RequestBody  pessoaFisica pessoaFisica){
		
		pessoaFisicaService.atualizar(id, pessoaFisica);
		return ResponseEntity.ok(pessoaFisica);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<pessoaFisica> deletar (@PathVariable  Long id){
		
		pessoaFisicaService.deletar(id);
		
		return ResponseEntity.ok().build();
	}
	

}
