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
@Table(name = "secretaria")
public class Secretaria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long idsecretaria;
	
	@Column
	private String nombre;
	@Column
	private String ape_pat;
	@Column
	private String ape_mat;
	@Column
	private String fecha_nac;
	@Column
	private String telefono;
	@Column
	private String correo;
	@Column
	private String fechade_ini_contrat;
	@Column
	private String fechade_fin_contrat;
	@Column
	private double sueldo;
	@Column
	private String direccion;
	@Column
	private String distrito;
	@Column
	private String estado;
	
	@OneToMany(mappedBy = "secretaria", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Matricula> matriculas = new ArrayList<>();
	
	public void addMatricula(Matricula matricula) {
		matriculas.add(matricula);
	}
	
	public void removePago(Matricula matricula) {
		matriculas.remove(matricula);
	}
	
	
	public Secretaria() {
		
	}








	public long getIdsecretaria() {
		return idsecretaria;
	}







	public void setIdsecretaria(long idsecretaria) {
		this.idsecretaria = idsecretaria;
	}







	public String getNombre() {
		return nombre;
	}







	public void setNombre(String nombre) {
		this.nombre = nombre;
	}







	public String getApe_pat() {
		return ape_pat;
	}







	public void setApe_pat(String ape_pat) {
		this.ape_pat = ape_pat;
	}







	public String getApe_mat() {
		return ape_mat;
	}







	public void setApe_mat(String ape_mat) {
		this.ape_mat = ape_mat;
	}







	public String getFecha_nac() {
		return fecha_nac;
	}







	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
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







	public String getFechade_ini_contrat() {
		return fechade_ini_contrat;
	}







	public void setFechade_ini_contrat(String fechade_ini_contrat) {
		this.fechade_ini_contrat = fechade_ini_contrat;
	}







	public String getFechade_fin_contrat() {
		return fechade_fin_contrat;
	}







	public void setFechade_fin_contrat(String fechade_fin_contrat) {
		this.fechade_fin_contrat = fechade_fin_contrat;
	}







	public double getSueldo() {
		return sueldo;
	}







	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
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







	public String getEstado() {
		return estado;
	}







	public void setEstado(String estado) {
		this.estado = estado;
	}






	
	
	
}
