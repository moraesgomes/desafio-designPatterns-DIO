package desafio.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dadosPessoaFisica {
	
	
	
	private String status;
	private String code;
	private String message;
	@Id
    private String cpf;
	private String nome;
    private String data_nascimento ;
    private String situacao_cadastral;
    private String genero;
    private String data_inscricao;
    private String digito_verificador;
    private String comprovante;
    
    
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getSituacao_cadastral() {
		return situacao_cadastral;
	}
	public void setSituacao_cadastral(String situacao_cadastral) {
		this.situacao_cadastral = situacao_cadastral;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getData_inscricao() {
		return data_inscricao;
	}
	public void setData_inscricao(String data_inscricao) {
		this.data_inscricao = data_inscricao;
	}
	public String getDigito_verificador() {
		return digito_verificador;
	}
	public void setDigito_verificador(String digito_verificador) {
		this.digito_verificador = digito_verificador;
	}
	public String getComprovante() {
		return comprovante;
	}
	public void setComprovante(String comprovante) {
		this.comprovante = comprovante;
	}
    
    
    
    
	
}
