package br.com.fiap.jpa.entity;

import java.io.Serializable;
import java.util.Calendar;

//Classe que possui os atributos que formam a chave composta
//Obrigatorio implmentar serializable

public class ConsultaPK implements Serializable{
	
	private int medico;
	
	private int paciente;
	
	private Calendar dataConsulta;
	
	
	

	public ConsultaPK() {
		super();
	}

	public ConsultaPK(int medico, int paciente, Calendar dataConsulta) {
		super();
		medico = medico;
		this.paciente = paciente;
		this.dataConsulta = dataConsulta;
	}

	public int getMedico() {
		return medico;
	}

	public void setMedico(int medico) {
		medico = medico;
	}

	public int getPaciente() {
		return paciente;
	}

	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}

	public Calendar getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Calendar dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	
	//HASHCODE e EQUALS servem pra fazer a comparação

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + medico;
		result = prime * result + ((dataConsulta == null) ? 0 : dataConsulta.hashCode());
		result = prime * result + paciente;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultaPK other = (ConsultaPK) obj;
		if (medico != other.medico)
			return false;
		if (dataConsulta == null) {
			if (other.dataConsulta != null)
				return false;
		} else if (!dataConsulta.equals(other.dataConsulta))
			return false;
		if (paciente != other.paciente)
			return false;
		return true;
	}
	
	

}
