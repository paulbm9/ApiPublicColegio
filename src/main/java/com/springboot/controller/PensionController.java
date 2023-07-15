package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.responsedto.PensionResponseDto;
import com.springboot.service.PensionService;

@RestController
@RequestMapping("/pension")
public class PensionController {
	@Autowired
	public PensionService pensionService;
	
	 @GetMapping("/getAll")
	    public ResponseEntity<List<PensionResponseDto>> getPensiones() {
	        List<PensionResponseDto> pensionResponseDtos = pensionService.getPensiones();
	        return new ResponseEntity<>(pensionResponseDtos, HttpStatus.OK);
	    }

}
