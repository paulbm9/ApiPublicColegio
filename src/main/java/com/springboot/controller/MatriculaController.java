package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.responsedto.MatriculaResponseDto;
import com.springboot.service.MatriculaService;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
	@Autowired
	public MatriculaService matriculaService;
	
	 @GetMapping("/getAll")
	    public ResponseEntity<List<MatriculaResponseDto>> getMatriculas() {
	        List<MatriculaResponseDto> matriculaResponseDtos = matriculaService.getMatriculas();
	        return new ResponseEntity<>(matriculaResponseDtos, HttpStatus.OK);
	    }

}
