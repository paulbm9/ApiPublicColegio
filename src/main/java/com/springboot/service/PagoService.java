package com.springboot.service;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dto.mapper;
import com.springboot.dto.responsedto.PagoResponseDto;
import com.springboot.model.Pago;
import java.util.stream.Collectors;
import com.springboot.repository.PagoRepository;

@Service
public class PagoService implements IPagoService{

	@Autowired
	private PagoRepository pagoRepository;
	
	@Override
	public List<PagoResponseDto> getPagos() {
		List<Pago> pagos = StreamSupport
                .stream(pagoRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return mapper.pagosToPagoResponseDtos(pagos);
	}

}
