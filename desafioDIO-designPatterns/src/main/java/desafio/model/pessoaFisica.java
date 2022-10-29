package desafio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class pessoaFisica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String token;
	

	@ManyToOne
	private dadosPessoaFisica dadosCadastrais;
	

	
	private String plugin;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public dadosPessoaFisica getDadosCadastrais() {
		return dadosCadastrais;
	}

	public void setDadosCadastrais(dadosPessoaFisica dadosCadastrais) {
		this.dadosCadastrais = dadosCadastrais;
	}

	

	public String getPlugin() {
		return plugin;
	}

	public void setPlugin(String plugin) {
		this.plugin = plugin;
	}
	
	
	
	

	

	
	
	
	
	
	

}
