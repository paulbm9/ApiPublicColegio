package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Matricula;

@Repository
public interface MatriculaRepository extends CrudRepository<Matricula, Long>{

}
