package br.com.fiap.dao;

import java.util.Calendar;

import br.com.fiap.entity.Reserva;

public interface ReservaDAO extends GenericDAO<Reserva,Integer>{

	long contarQuantidade();
	
	long contarQuantidadePorCliente(int idCliente);
	
	//Contar a quantidade de reservas por um determinado periodo
	long contarPorDatas(Calendar inicio,Calendar fim);
	
	//Contar a quantidade de reserva por estado do cliente 
	long contarPorEstadoCliente(String uf);
	
}
