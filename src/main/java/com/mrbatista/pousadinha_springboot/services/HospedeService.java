package com.mrbatista.pousadinha_springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrbatista.pousadinha_springboot.dto.HospedeMinDTO;
import com.mrbatista.pousadinha_springboot.entities.Hospede;
import com.mrbatista.pousadinha_springboot.repositories.HospedeRepository;

@Service
public class HospedeService {
	
	@Autowired
	private HospedeRepository hospedeRepository;
	
	public List<HospedeMinDTO> findAll (){
		List<Hospede> result = hospedeRepository.findAll();
		List<HospedeMinDTO> dto = result.stream().map(x -> new HospedeMinDTO(x)).toList();
		return dto;
	}

}
