package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Pago;

@Repository
public interface PagoRepository extends CrudRepository<Pago, Long>{

}
