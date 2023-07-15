package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.dto.responsedto.PensionResponseDto;

@Service
public interface IPensionService {
	
	public List<PensionResponseDto>getPensiones();

}
