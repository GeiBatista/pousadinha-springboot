package com.mrbatista.pousadinha_springboot.dto;

import com.mrbatista.pousadinha_springboot.entities.HospedeList;

public class HospedeListDTO {
	
	private Long id;
	private String name;
	
	public HospedeListDTO() {}

	public HospedeListDTO(HospedeList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
