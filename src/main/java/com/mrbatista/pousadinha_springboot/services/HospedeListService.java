package com.mrbatista.pousadinha_springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mrbatista.pousadinha_springboot.dto.HospedeListDTO;
import com.mrbatista.pousadinha_springboot.entities.HospedeList;
import com.mrbatista.pousadinha_springboot.repositories.HospedeListRepository;

@Service
public class HospedeListService {
	
	@Autowired
	HospedeListRepository hospedeListRepository;
	
	@Transactional(readOnly = true)
	public List<HospedeListDTO> findAll () {		
		List<HospedeList> hospedes = hospedeListRepository.findAll();		
		List<HospedeListDTO> dto = hospedes.stream().map(x -> new HospedeListDTO(x)).toList();		
//		for(HospedeList hospede : hospedes ){
//			HospedeList result = new HospedeList(hospede.getId(), hospede.getName());
//			lista.add(hospede);
//		}
		return dto;
	}
	

}
