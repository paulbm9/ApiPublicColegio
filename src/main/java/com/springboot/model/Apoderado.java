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
@Table(name = "apoderado")
public class Apoderado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long idapoderado;
	@Column
	private String nombre;
	@Column
	private String apepat;
	@Column
	private String apemat;
	@Column
	private String fechanac;
	@Column
	private String telefono;
	@Column
	private String correo;
	@Column
	private String direccion;
	@Column
	private String distrito;
	@Column
	private String ocupacion;
	
	@OneToMany(mappedBy = "apoderado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Pago> pagos = new ArrayList<>();
	
	public void addPago(Pago pago) {
		pagos.add(pago);
	}
	
	public void removePago(Pago pago) {
		pagos.remove(pago);
	}
	
	

	public Apoderado(String nombre, String apepat, String apemat, String fechanac, String telefono, String correo,
			String direccion, String distrito, String ocupacion, List<Pago> pagos) {
		super();
		this.nombre = nombre;
		this.apepat = apepat;
		this.apemat = apemat;
		this.fechanac = fechanac;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.distrito = distrito;
		this.ocupacion = ocupacion;
		this.pagos = pagos;
	}

	public long getIdapoderado() {
		return idapoderado;
	}
	public void setIdapoderado(long idapoderado) {
		this.idapoderado = idapoderado;
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
	public String getFechanac() {
		return fechanac;
	}
	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
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
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	
}
