package com.mrbatista.pousadinha_springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mrbatista.pousadinha_springboot.dto.HospedeDTO;
import com.mrbatista.pousadinha_springboot.dto.HospedeMinDTO;
import com.mrbatista.pousadinha_springboot.entities.Hospede;
import com.mrbatista.pousadinha_springboot.projections.HospedeMinProjection;
import com.mrbatista.pousadinha_springboot.repositories.HospedeRepository;



@Service
public class HospedeService {
	
	@Autowired
	private HospedeRepository hospedeRepository;
	
	@Transactional(readOnly = true)
	public List<HospedeMinDTO> findAll (){
		List<Hospede> result = hospedeRepository.findAll();
		List<HospedeMinDTO> dto = result.stream().map(x -> new HospedeMinDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public HospedeDTO findById(Long id) {
		Hospede hospede = hospedeRepository.findById(id).get();
		HospedeDTO dto = new HospedeDTO(hospede);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<HospedeMinDTO> findByList(Long listId){
		List<HospedeMinProjection> result = hospedeRepository.searchByList(listId);
		return result.stream().map(x -> new HospedeMinDTO(x)).toList();
	}

}
