package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_PESSOA_FISICA")
//@DiscriminatorValue("PF")
public class PessoaFisica extends Pessoa {
	

	@Column(name="nr_cpf")
	private String cpf;
	
	@Column(name="nr_rg")
	private String rg;


	public PessoaFisica(String nome, String endereço, String cpf, String rg) {
		super(nome, endereço);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	
	public PessoaFisica(String nome, String endereço) {
		super(nome, endereço);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
		
	}

}
