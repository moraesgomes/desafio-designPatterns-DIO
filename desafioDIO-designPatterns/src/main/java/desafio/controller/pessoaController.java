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

import desafio.model.pessoa;
import desafio.service.pessoaService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("pessoas")
public class pessoaController {
	
	@Autowired
	private pessoaService pessoaService;
	
	@GetMapping
	public ResponseEntity<Iterable<pessoa>>buscarTodos(){
		
		return ResponseEntity.ok(pessoaService.buscarTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<pessoa> buscarPorId(@PathVariable Long id){
		
		return ResponseEntity.ok(pessoaService.buscarPorId(id));
	}

	@PostMapping
	public ResponseEntity<pessoa> inserir (@RequestBody pessoa pessoa){
		
		pessoaService.inserir(pessoa);
		
		return ResponseEntity.ok(pessoa);
	}
	
	@PutMapping
	public ResponseEntity<pessoa> atualizar(@PathVariable   Long id,@RequestBody  pessoa pessoa){
		
		pessoaService.atualizar(id, pessoa);
		return ResponseEntity.ok(pessoa);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<pessoa> deletar (@PathVariable  Long id){
		
		pessoaService.deletar(id);
		
		return ResponseEntity.ok().build();
	}
	

}
