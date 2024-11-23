package com.mrbatista.pousadinha_springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrbatista.pousadinha_springboot.dto.HospedeListDTO;
import com.mrbatista.pousadinha_springboot.services.HospedeListService;

@RestController
@RequestMapping(value = "/lists")
public class HospedeListController {
	
	@Autowired
	HospedeListService hospedeListService;
	
	@GetMapping
	public List<HospedeListDTO> findAll () {
		List<HospedeListDTO> lists = hospedeListService.findAll();
		return lists;
	}

}
