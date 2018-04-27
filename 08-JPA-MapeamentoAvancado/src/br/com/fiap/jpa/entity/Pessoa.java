package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Inheritance(strategy=InheritanceType.JOINED)

//Configuração da SingleTable
//@DiscriminatorColumn(name="DS_TIPO")
//@DiscriminatorValue("P")

@Entity
@Table(name="T_PESSOA")
@SequenceGenerator(name="pessoa",sequenceName="SQ_T_PESSOA",allocationSize=1)
public class Pessoa {
	
	@Id
	@Column(name="cd_pessoa")
	@GeneratedValue(generator="pessoa",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_pessoa")
	private String nome;
	
	@Column(name="ds_endereco")
	private String endereço;
	
	

	public Pessoa(String nome, String endereço) {
		super();
		this.nome = nome;
		this.endereço = endereço;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	

}
