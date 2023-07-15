package com.springboot.dto.responsedto;

public class PensionResponseDto {
	private Long id_pension;
	private String fecha_vencimiento;
	private String fecha_operacion;
	private double monto;
	private String estado;
	private String nombreEstudiante;
	
	
	
	
	public String getNombreEstudiante() {
		return nombreEstudiante;
	}
	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}
	public Long getId_pension() {
		return id_pension;
	}
	public void setId_pension(Long id_pension) {
		this.id_pension = id_pension;
	}
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	public String getFecha_operacion() {
		return fecha_operacion;
	}
	public void setFecha_operacion(String fecha_operacion) {
		this.fecha_operacion = fecha_operacion;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
