package com.springboot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column
	private long idmatricula;
	@Column
	private String fechamatricula;
	
	@Column
	private String cronograma;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="idpago")
	private Pago pago;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="idsecretaria")
	private Secretaria secretaria;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="idsalon")
	private Salon salon;
	
	@OneToMany(mappedBy = "matricula", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Pension> pensiones = new ArrayList<>();
	
	public void addMatricula(Pension pension) {
		pensiones.add(pension);
	}
	
	public void removeMatricula(Pension pension) {
		pensiones.remove(pension);
	}

	public long getIdmatricula() {
		return idmatricula;
	}

	public void setIdmatricula(long idmatricula) {
		this.idmatricula = idmatricula;
	}

	public String getFechamatricula() {
		return fechamatricula;
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

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Secretaria getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}

	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}
	
	
	
	
}
