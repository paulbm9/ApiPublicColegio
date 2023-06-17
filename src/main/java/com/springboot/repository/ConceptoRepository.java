package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Concepto;

public interface ConceptoRepository extends JpaRepository<Concepto, Long>{

}
