package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.PessoaDAO;
import br.com.fiap.jpa.dao.impl.PessoaDAOImpl;
import br.com.fiap.jpa.entity.Pessoa;
import br.com.fiap.jpa.entity.PessoaFisica;
import br.com.fiap.jpa.entity.PessoaJuridica;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class HerancaTeste {

	public static void main(String[] args) {
		
		//Cadastrar uma pessoa, PF e PJ
		
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		
		PessoaDAO dao = new PessoaDAOImpl(em);		
		
		Pessoa pessoa = new Pessoa("Juliana", "Oz");
		
		PessoaFisica pf = new PessoaFisica("Novais", "São Francisco","232.54.895-65","95.845.512-56");
		
		PessoaJuridica pj = new PessoaJuridica("FIAP","Lins","232.54.895-65","95.845.512-56");
		
				
		try {
			dao.inserir(pessoa);
			dao.inserir(pf);
			dao.inserir(pj);
			dao.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		em.close();
		fabrica.close();

	}

}
