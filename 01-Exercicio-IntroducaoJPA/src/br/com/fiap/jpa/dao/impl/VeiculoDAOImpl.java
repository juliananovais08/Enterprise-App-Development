package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;
import br.com.fiap.jpa.dao.VeiculoDAO;
import br.com.fiap.jpa.entity.Veiculo;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.RegistroNaoEncontrado;

public class VeiculoDAOImpl implements VeiculoDAO {

	private EntityManager em;
	
	public VeiculoDAOImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public void cadastrar(Veiculo veiculo) {
		em.persist(veiculo);
	}

	@Override
	public void atualizar(Veiculo veiculo) {
		em.merge(veiculo);
	}

	@Override
	public void remover(int codigo) throws RegistroNaoEncontrado {
		Veiculo veiculo = buscar(codigo);
		if (veiculo == null){
			throw new RegistroNaoEncontrado("Registro não encontrado");
		}
		em.remove(veiculo);
	}

	@Override
	public Veiculo buscar(int codigo) {
		return em.find(Veiculo.class, codigo);
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
