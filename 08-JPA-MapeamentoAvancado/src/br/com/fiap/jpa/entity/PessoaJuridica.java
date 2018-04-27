package br.com.fiap.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_PESSOA_JURIDICA")
//@DiscriminatorValue("PJ")
public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	
	private String Razao;
	
	

	public PessoaJuridica(String nome, String endere�o) {
		super(nome, endere�o);
	}

	public PessoaJuridica(String nome, String endere�o, String cnpj, String razao) {
		super(nome, endere�o);
		this.cnpj = cnpj;
		this.Razao = razao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao() {
		return Razao;
	}

	public void setRazao(String razao) {
		this.Razao = razao;
	}
	
	

}
