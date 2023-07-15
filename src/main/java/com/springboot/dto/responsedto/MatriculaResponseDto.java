package com.springboot.dto.responsedto;

public class MatriculaResponseDto {
	private Long idmatricula;
	private String fechamatricula;
	private String cronograma;
	private String fechaPago;
	private String nombreEstudiante;
	private String nombreSecretaria;
	private String nombreSalon;
	public Long getIdmatricula() {
		return idmatricula;
	}
	public void setIdmatricula(Long idmatricula) {
		this.idmatricula = idmatricula;
	}
	public String getFechamatricula() {
		return fechamatricula;
	}
	
	
	public String getNombreEstudiante() {
		return nombreEstudiante;
	}
	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}
	public void setFechamatricula(String fechamatricula) {
		this.fechamatricula = fechamatricula;
	}
	public String getCronograma() {
		return cronograma;
	}
	public void setCronograma(String cronograma) {
		this.cronograma = cronograma;
	}
	public String getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}
	public String getNombreSecretaria() {
		return nombreSecretaria;
	}
	public void setNombreSecretaria(String nombreSecretaria) {
		this.nombreSecretaria = nombreSecretaria;
	}
	public String getNombreSalon() {
		return nombreSalon;
	}
	public void setNombreSalon(String nombreSalon) {
		this.nombreSalon = nombreSalon;
	}
	
	
	
	
	

}
