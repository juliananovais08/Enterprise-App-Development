package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.entity.Veiculo;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.RegistroNaoEncontrado;

public interface VeiculoDAO {

	void cadastrar(Veiculo veiculo);
	
	void atualizar(Veiculo veiculo);
	
	void remover(int codigo) throws RegistroNaoEncontrado ;
	
	Veiculo buscar(int codigo);
	
	void commit() throws CommitException;
}

