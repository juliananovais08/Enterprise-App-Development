package br.com.fiap.nac.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.nac.dao.ApartamentoDAO;
import br.com.fiap.nac.entity.Apartamento;

public class ApartamentoDAOImpl extends GenericDAOImpl<Apartamento, Integer> implements ApartamentoDAO{

	public ApartamentoDAOImpl(EntityManager em) {
		super(em);
		
	}

	@Override
	public List<Apartamento> listarPorParteDescricao(String descricao) {

		return em.createQuery("from Apartamento a where a.detalhes like :d",Apartamento.class).setParameter("d", "%"+descricao+"%").getResultList();
	}

}
