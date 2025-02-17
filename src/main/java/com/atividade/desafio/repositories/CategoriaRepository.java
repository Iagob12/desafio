package com.atividade.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.desafio.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
