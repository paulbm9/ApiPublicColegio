package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.responsedto.PagoResponseDto;
import com.springboot.service.PagoService;

@RestController
@RequestMapping("/pago")
public class PagoController {
	@Autowired
	public PagoService pagoService;
	
	 @GetMapping("/getAll")
	    public ResponseEntity<List<PagoResponseDto>> getPagos() {
	        List<PagoResponseDto> pagoResponseDtos = pagoService.getPagos();
	        return new ResponseEntity<>(pagoResponseDtos, HttpStatus.OK);
	    }

}
