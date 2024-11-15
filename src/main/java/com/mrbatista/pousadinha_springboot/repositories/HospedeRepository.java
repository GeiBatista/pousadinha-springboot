package com.mrbatista.pousadinha_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrbatista.pousadinha_springboot.entities.Hospede;

public interface HospedeRepository extends JpaRepository<Hospede, Long>{

}
