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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "concepto")
public class Concepto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long idconcepto;
	
	@Column
	private String nomconcepto;
	
	
	@OneToMany(mappedBy = "concepto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Pago> pagos = new ArrayList<>();
	
	public void addPago(Pago pago) {
		pagos.add(pago);
	}
	
	public void removePago(Pago pago) {
		pagos.remove(pago);
	}
	

	public Concepto(String nomconcepto, List<Pago> pagos) {
		this.nomconcepto = nomconcepto;
		this.pagos = pagos;
	}

	public long getIdconcepto() {
		return idconcepto;
	}

	public void setIdconcepto(int idconcepto) {
		this.idconcepto = idconcepto;
	}

	public String getNomconcepto() {
		return nomconcepto;
	}

	public void setNomconcepto(String nomconcepto) {
		this.nomconcepto = nomconcepto;
	}
	
	
	
	
}
