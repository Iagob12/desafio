package com.atividade.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.atividade.desafio.entities.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Long>{

}
