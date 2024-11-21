package com.mrbatista.pousadinha_springboot.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_prioridade")
public class Prioridade {
	
	@EmbeddedId
	PrioridadePK id = new PrioridadePK();
	
	private Integer position;

	public Prioridade() {}

	public Prioridade(Hospede hospede, HospedeList list,Integer position) {
		id.setHospede(hospede);
		id.setList(list);
		this.position = position;
	}

	public PrioridadePK getId() {
		return id;
	}

	public void setId(PrioridadePK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prioridade other = (Prioridade) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
