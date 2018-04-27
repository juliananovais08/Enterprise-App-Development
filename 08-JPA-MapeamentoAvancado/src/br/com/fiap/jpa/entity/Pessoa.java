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

//Configura��o da SingleTable
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
	private String endere�o;
	
	

	public Pessoa(String nome, String endere�o) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	

}
