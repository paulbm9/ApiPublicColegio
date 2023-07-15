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
@Table(name = "cajero")
public class Cajero {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long idcajero;
	@Column
	private String nombre;
	@Column
	private String apepat;
	@Column
	private String apemat;
	
	@Column
	private String fechadenac;
	@Column
	private String telefono;
	@Column
	private String correo;
	@Column
	private String fechadeinicontrat;
	@Column
	private String fechadefincontrat;
	@Column
	private double sueldo;
	@Column
	private String estado;
	@Column
	private String direccion;
	@Column
	private String distrito;
	@Column
	private String observaciones;
	
	@OneToMany(mappedBy = "cajero", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Pago> pagos = new ArrayList<>();
	
	public void addPago(Pago pago) {
		pagos.add(pago);
	}
	
	public void removePago(Pago pago) {
		pagos.remove(pago);
	}
	
	
	
	public Cajero(String nombre, String apepat, String apemat, String fechadenac, String telefono, String correo,
			String fechadeinicontrat, String fechadefincontrat, double sueldo, String estado, String direccion,
			String distrito, String observaciones, List<Pago> pagos) {
		super();
		this.nombre = nombre;
		this.apepat = apepat;
		this.apemat = apemat;
		this.fechadenac = fechadenac;
		this.telefono = telefono;
		this.correo = correo;
		this.fechadeinicontrat = fechadeinicontrat;
		this.fechadefincontrat = fechadefincontrat;
		this.sueldo = sueldo;
		this.estado = estado;
		this.direccion = direccion;
		this.distrito = distrito;
		this.observaciones = observaciones;
		this.pagos = pagos;
	}

	//Constructores
	public Cajero() {
		
	}
	public Cajero(long idcajero, String nombre, String apepat, String apemat, String fechadenac, String telefono,
			String correo, String fechadeinicontrat, String fechadefincontrat, double sueldo, String estado,
			String direccion, String distrito, String observaciones) {
		super();
		this.idcajero = idcajero;
		this.nombre = nombre;
		this.apepat = apepat;
		this.apemat = apemat;
		this.fechadenac = fechadenac;
		this.telefono = telefono;
		this.correo = correo;
		this.fechadeinicontrat = fechadeinicontrat;
		this.fechadefincontrat = fechadefincontrat;
		this.sueldo = sueldo;
		this.estado = estado;
		this.direccion = direccion;
		this.distrito = distrito;
		this.observaciones = observaciones;
	}
	//Metodos get y set
	public long getIdcajero() {
		return idcajero;
	}
	public void setIdcajero(long idcajero) {
		this.idcajero = idcajero;
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
	public String getFechadeinicontrat() {
		return fechadeinicontrat;
	}
	public void setFechadeinicontrat(String fechadeinicontrat) {
		this.fechadeinicontrat = fechadeinicontrat;
	}
	public String getFechadefincontrat() {
		return fechadefincontrat;
	}
	public void setFechadefincontrat(String fechadefincontrat) {
		this.fechadefincontrat = fechadefincontrat;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}
