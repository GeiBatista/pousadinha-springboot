package com.mrbatista.pousadinha_springboot.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class PrioridadePK {
	
	@ManyToOne
	@JoinColumn(name = "hospede_id")
	private Hospede hospede;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private HospedeList list;
	
	public PrioridadePK() {}

	public PrioridadePK(Hospede hospede, HospedeList list) {
		this.hospede = hospede;
		this.list = list;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public HospedeList getList() {
		return list;
	}

	public void setList(HospedeList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hospede, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrioridadePK other = (PrioridadePK) obj;
		return Objects.equals(hospede, other.hospede) && Objects.equals(list, other.list);
	}

}
