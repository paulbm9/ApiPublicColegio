package com.springboot.service;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dto.mapper;
import com.springboot.dto.responsedto.PensionResponseDto;
import com.springboot.model.Pension;

import java.util.stream.Collectors;
import com.springboot.repository.PensionRepository;

@Service
public class PensionService implements IPensionService{

	@Autowired
	private PensionRepository pensionRepository;
	
	

	@Override
	public List<PensionResponseDto> getPensiones() {
		List<Pension> pensiones = StreamSupport
                .stream(pensionRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return mapper.pensionesToPensionResponseDto(pensiones);
	}

}
