package com.algaworks.vinhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.vinhos.model.Vinho;

public interface VinhosRepository extends JpaRepository<Vinho, Long>{

}
