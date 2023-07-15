package com.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pension")
public class Pension {
	
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_pension")
	    public long id_pension;

	   @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "idmatricula")
	    public Matricula matricula;
	    
	  
	
	@Column
	public String fecha_vencimiento;
	
	@Column
	public String fecha_operacion;
	
	@Column
	public double monto;
	
	@Column
	public String estado;

	public long getId_pension() {
		return id_pension;
	}

	public void setId_pension(long id_pension) {
		this.id_pension = id_pension;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
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
