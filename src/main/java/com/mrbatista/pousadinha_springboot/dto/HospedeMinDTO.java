package com.mrbatista.pousadinha_springboot.dto;

import com.mrbatista.pousadinha_springboot.entities.Hospede;

public class HospedeMinDTO {
	
	private Long id;	
	private String nome;
	private String email;
	private String telefone;		
	private Integer idade;	
	private String imgUrl;
	
	public HospedeMinDTO() {}

	public HospedeMinDTO(Hospede entity) {
		id = entity.getId();
		nome = entity.getNome();
		email = entity.getEmail();
		telefone = entity.getTelefone();
		idade = entity.getIdade();
		imgUrl = entity.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getImgUrl() {
		return imgUrl;
	}
	
	
	

}
