package com.mrbatista.pousadinha_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.mrbatista.pousadinha_springboot.entities.HospedeList;

public interface HospedeListRepository extends JpaRepository<HospedeList, Long> {
	
	@Modifying
	@Query(nativeQuery = true, 
	value = "UPDATE tb_prioridade SET position = :newPosition WHERE list_id = :listId AND hospede_id = :hospedeId")
	void updatePrioridadegPosition(Long listId, Long hospedeId, Integer newPosition);

}
