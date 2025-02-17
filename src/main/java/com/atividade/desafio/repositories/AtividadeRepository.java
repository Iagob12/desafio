package com.atividade.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.desafio.entities.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Long>{

}
