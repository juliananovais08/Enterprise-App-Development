package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;
import br.com.fiap.jpa.dao.MotoristaDAO;
import br.com.fiap.jpa.entity.Motorista;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.RegistroNaoEncontrado;

public class MotoristaDAOImpl implements MotoristaDAO {

	private EntityManager em;
	
	public MotoristaDAOImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public void cadastrar(Motorista motorista) {
		em.persist(motorista);
	}

	@Override
	public void atualizar(Motorista motorista) {
		em.merge(motorista);
	}

	@Override
	public void remover(int codigo) throws RegistroNaoEncontrado {
		Motorista motorista = buscar(codigo);
		if (motorista == null){
			throw new RegistroNaoEncontrado("Registro não encontrado");
		}
		em.remove(motorista);
	}

	@Override
	public Motorista buscar(int codigo) {
		return em.find(Motorista.class, codigo);
	}

	@Override
	public void commit() throws CommitException {
		try{
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e){
			if (em.getTransaction().isActive()){
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			throw new CommitException("Erro ao gravar");
		}
		
	}

}
