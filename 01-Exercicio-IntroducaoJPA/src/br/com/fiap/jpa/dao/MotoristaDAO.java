package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.entity.Motorista;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.RegistroNaoEncontrado;

public interface MotoristaDAO {

	void cadastrar(Motorista motorista);
	
	void atualizar(Motorista motorista);
	
	void remover(int codigo) throws RegistroNaoEncontrado ;
	
	Motorista buscar(int codigo);
	
	void commit() throws CommitException;
}

