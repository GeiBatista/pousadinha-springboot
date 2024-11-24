package com.mrbatista.pousadinha_springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mrbatista.pousadinha_springboot.entities.Hospede;
import com.mrbatista.pousadinha_springboot.projections.HospedeMinProjection;

public interface HospedeRepository extends JpaRepository<Hospede, Long> {

	@Query(nativeQuery = true, value = """
				SELECT tb_hospede.id, tb_hospede.nome, tb_hospede.idade, tb_hospede.img_url AS imgUrl,
				tb_hospede.email, tb_hospede.telefone
				FROM tb_hospede
				INNER JOIN tb_prioridade ON tb_hospede.id = tb_prioridade.hospede_id
				WHERE tb_prioridade.list_id = :listId
				ORDER BY tb_prioridade.position
			""")
	List<HospedeMinProjection> searchByList(Long listId);
}
