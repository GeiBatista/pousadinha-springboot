package com.mrbatista.pousadinha_springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrbatista.pousadinha_springboot.dto.HospedeMinDTO;
import com.mrbatista.pousadinha_springboot.entities.Hospede;
import com.mrbatista.pousadinha_springboot.services.HospedeService;

@RestController
@RequestMapping(value = "/hospede")
public class HospedeController {
	
	@Autowired
	private HospedeService hospedeService;
	
	@GetMapping
	public List<HospedeMinDTO> findAll(){
	List<HospedeMinDTO> result = hospedeService.findAll();
	return result;
	}

}