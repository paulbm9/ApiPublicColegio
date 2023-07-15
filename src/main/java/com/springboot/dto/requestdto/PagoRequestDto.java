package com.springboot.dto.requestdto;

public class PagoRequestDto {

	private String fechaoperacion;
	private double monto;
	private Long idcajero;
	private Long idapoderado;
	private Long idestudiante;
	private Long idconcepto;
	
	public String getFechaoperacion() {
		return fechaoperacion;
	}
	public void setFechaoperacion(String fechaoperacion) {
		this.fechaoperacion = fechaoperacion;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public Long getIdcajero() {
		return idcajero;
	}
	public void setIdcajero(Long idcajero) {
		this.idcajero = idcajero;
	}
	public Long getIdapoderado() {
		return idapoderado;
	}
	public void setIdapoderado(Long idapoderado) {
		this.idapoderado = idapoderado;
	}
	public Long getIdestudiante() {
		return idestudiante;
	}
	public void setIdestudiante(Long idestudiante) {
		this.idestudiante = idestudiante;
	}
	public Long getIdconcepto() {
		return idconcepto;
	}
	public void setIdconcepto(Long idconcepto) {
		this.idconcepto = idconcepto;
	}
	
	
}
