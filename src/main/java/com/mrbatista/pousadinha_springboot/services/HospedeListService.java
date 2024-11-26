package com.mrbatista.pousadinha_springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mrbatista.pousadinha_springboot.dto.HospedeListDTO;
import com.mrbatista.pousadinha_springboot.entities.HospedeList;
import com.mrbatista.pousadinha_springboot.projections.HospedeMinProjection;
import com.mrbatista.pousadinha_springboot.repositories.HospedeListRepository;
import com.mrbatista.pousadinha_springboot.repositories.HospedeRepository;

@Service
public class HospedeListService {
	
	@Autowired
	HospedeListRepository hospedeListRepository;

	@Autowired
	HospedeRepository hospedeRepository;
	
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
	
	@Transactional
	public void move (Long listId, int sourceIndex, int destinationIndex) {
		
		List<HospedeMinProjection> list = hospedeRepository.searchByList(listId);
		
		HospedeMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for (int i = min; i <= max; i++) {
			hospedeListRepository.updatePrioridadegPosition(listId, list.get(i).getId(), i);
		}
	}
	

}
