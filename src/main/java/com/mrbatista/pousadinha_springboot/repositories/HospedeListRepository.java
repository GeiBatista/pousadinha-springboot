package com.mrbatista.pousadinha_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrbatista.pousadinha_springboot.entities.HospedeList;

public interface HospedeListRepository extends JpaRepository<HospedeList, Long> {

}
