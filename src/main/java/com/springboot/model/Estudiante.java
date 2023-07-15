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
@Table(name = "estudiante")
public class Estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long idestudiante;
	@Column
	private String nombre;
	@Column
	private String apepat;
	@Column
	private String apemat;
	@Column
	private String fechadenac;
	@Column
	private String direccion;
	@Column
	private String distrito;
	@Column
	private String telefono;
	@Column
	private String correo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idapoderado")
	private Apoderado apoderado;
	
	@OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Pago> pagos = new ArrayList<>();
	
	public void addPago(Pago pago) {
		pagos.add(pago);
	}
	
	public void removePago(Pago pago) {
		pagos.remove(pago);
	}


    public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(long idestudiante) {
		this.idestudiante = idestudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApepat() {
		return apepat;
	}

	public void setApepat(String apepat) {
		this.apepat = apepat;
	}

	public String getApemat() {
		return apemat;
	}

	public void setApemat(String apemat) {
		this.apemat = apemat;
	}

	public String getFechadenac() {
		return fechadenac;
	}

	public void setFechadenac(String fechadenac) {
		this.fechadenac = fechadenac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Apoderado getApoderado() {
		return apoderado;
	}

	public void setApoderado(Apoderado apoderado) {
		this.apoderado = apoderado;
	}
	
	
}
