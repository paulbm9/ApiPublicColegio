package com.springboot.dto;

import java.util.ArrayList;
import java.util.List;

import com.springboot.dto.responsedto.PagoResponseDto;
import com.springboot.model.Pago;

public class mapper {
	
	public static PagoResponseDto pagoToPagoResponseDto(Pago pago) {
        PagoResponseDto pagoResponseDto = new PagoResponseDto();
        pagoResponseDto.setIdpago(pago.getIdpago());
        pagoResponseDto.setNombreCajero(pago.getCajero().getNombre());
        return pagoResponseDto;
    }

    public static List<PagoResponseDto> pagosToPagoResponseDtos(List<Pago> pagos) {
        List<PagoResponseDto> pagoResponseDtos = new ArrayList<>();
        for (Pago pago: pagos) {
            pagoResponseDtos.add(pagoToPagoResponseDto(pago));
        }
        return pagoResponseDtos;
    }

}
