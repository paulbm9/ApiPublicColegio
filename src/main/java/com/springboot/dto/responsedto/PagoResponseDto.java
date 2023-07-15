package com.springboot.dto.responsedto;

public class PagoResponseDto {
	private Long idpago;
	private String fechaoperacion;
	private double monto;
	private String nombreCajero;
	private String nombreApoderado;
	private String nombreConcepto;
	private String nombreEstudiante;
	public Long getIdpago() {
		return idpago;
	}
	public void setIdpago(Long idpago) {
		this.idpago = idpago;
	}
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
	public String getNombreCajero() {
		return nombreCajero;
	}
	public void setNombreCajero(String nombreCajero) {
		this.nombreCajero = nombreCajero;
	}
	public String getNombreApoderado() {
		return nombreApoderado;
	}
	public void setNombreApoderado(String nombreApoderado) {
		this.nombreApoderado = nombreApoderado;
	}
	public String getNombreConcepto() {
		return nombreConcepto;
	}
	public void setNombreConcepto(String nombreConcepto) {
		this.nombreConcepto = nombreConcepto;
	}
	public String getNombreEstudiante() {
		return nombreEstudiante;
	}
	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}
	
	

}
