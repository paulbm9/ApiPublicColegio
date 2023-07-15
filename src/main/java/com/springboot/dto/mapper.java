package com.springboot.dto;

import java.util.ArrayList;
import java.util.List;

import com.springboot.dto.responsedto.MatriculaResponseDto;
import com.springboot.dto.responsedto.PagoResponseDto;
import com.springboot.model.Matricula;
import com.springboot.model.Pago;

public class mapper {
	
	public static PagoResponseDto pagoToPagoResponseDto(Pago pago) {
        PagoResponseDto pagoResponseDto = new PagoResponseDto();
        pagoResponseDto.setIdpago(pago.getIdpago());
        pagoResponseDto.setFechaoperacion(pago.getFechaoperacion());
        pagoResponseDto.setMonto(pago.getMonto());
        pagoResponseDto.setNombreCajero(pago.getCajero().getNombre());
        pagoResponseDto.setNombreApoderado(pago.getApoderado().getNombre()+" "+pago.getApoderado().getApepat());
        pagoResponseDto.setNombreEstudiante(pago.getEstudiante().getNombre()+" "+pago.getEstudiante().getApepat());
        pagoResponseDto.setNombreConcepto(pago.getConcepto().getNomconcepto());
        return pagoResponseDto;
    }

    public static List<PagoResponseDto> pagosToPagoResponseDtos(List<Pago> pagos) {
        List<PagoResponseDto> pagoResponseDtos = new ArrayList<>();
        for (Pago pago: pagos) {
            pagoResponseDtos.add(pagoToPagoResponseDto(pago));
        }
        return pagoResponseDtos;
    }
    
    public static MatriculaResponseDto matriculaToMatriculaResponseDto(Matricula matricula) {
        MatriculaResponseDto matriculaResponseDto = new MatriculaResponseDto();
        matriculaResponseDto.setIdmatricula(matricula.getIdmatricula());
        matriculaResponseDto.setFechamatricula(matricula.getFechamatricula());
        matriculaResponseDto.setCronograma(matricula.getCronograma());
        matriculaResponseDto.setNombreEstudiante(matricula.getPago().getEstudiante().getNombre()+ " "+matricula.getPago().getEstudiante().getApepat());
        matriculaResponseDto.setFechaPago(matricula.getPago().getFechaoperacion());
        matriculaResponseDto.setNombreSecretaria(matricula.getSecretaria().getNombre()+" "+matricula.getSecretaria().getApe_pat());
        matriculaResponseDto.setNombreSalon(matricula.getSalon().getGrado()+" "+matricula.getSalon().getSeccion()+" "+matricula.getSalon().getAnio());
        return matriculaResponseDto;
    }

    public static List<MatriculaResponseDto> matriculasToMatriculaResponseDtos(List<Matricula> matriculas) {
        List<MatriculaResponseDto> matriculaResponseDtos = new ArrayList<>();
        for (Matricula matricula: matriculas) {
        	matriculaResponseDtos.add(matriculaToMatriculaResponseDto(matricula));
        }
        return matriculaResponseDtos;
    }

}
