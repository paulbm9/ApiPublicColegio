package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Concepto;
import com.springboot.repository.ConceptoRepository;

@RestController
public class ConceptoController {

	@Autowired
	ConceptoRepository repository;
	
	@GetMapping(value = "/")
	public String holaMundo() {
		return "Hola mundo!";
	}
	@GetMapping(value = "/concepto")
	public List<Concepto>getConceptos(){
		return repository.findAll();
	}
	
	@PostMapping(value = "/saveConcepto")
	public String saveConcepto(@RequestBody Concepto Concepto) {
		repository.save(Concepto);
		return "Saved Concepto";
	}
	
	@PutMapping(value = "/update/{id}")
	public String updateConcepto(@PathVariable long id, @RequestBody Concepto Concepto) {
		Concepto updatedConcepto = repository.findById(id).get();
		updatedConcepto.setNomconcepto(Concepto.getNomconcepto());
		repository.save(updatedConcepto);
		return "Updated Concepto";
	}
	
	@DeleteMapping(value = "delete/{id}")
	public String deleteConcepto(@PathVariable long id) {
		Concepto deletedConcepto = repository.findById(id).get();
		repository.delete(deletedConcepto);
		return "Deleted Concepto";
	}
	
}
