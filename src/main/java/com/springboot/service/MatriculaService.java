package com.springboot.service;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dto.mapper;
import com.springboot.dto.responsedto.MatriculaResponseDto;
import com.springboot.model.Matricula;
import java.util.stream.Collectors;

import com.springboot.repository.MatriculaRepository;

@Service
public class MatriculaService implements IMatriculaService{

	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@Override
	public List<MatriculaResponseDto> getMatriculas() {
		List<Matricula> matriculas = StreamSupport
                .stream(matriculaRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return mapper.matriculasToMatriculaResponseDtos(matriculas);
	}

}
