package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.dto.responsedto.PagoResponseDto;

@Service
public interface IPagoService {
	
	public List<PagoResponseDto>getPagos();

}
