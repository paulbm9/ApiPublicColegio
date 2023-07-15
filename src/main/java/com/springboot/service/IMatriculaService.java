package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.dto.responsedto.MatriculaResponseDto;

@Service
public interface IMatriculaService {
	
	public List<MatriculaResponseDto>getMatriculas();

}
