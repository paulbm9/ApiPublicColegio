package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Pension;

@Repository
public interface PensionRepository extends CrudRepository<Pension, Long>{

}
