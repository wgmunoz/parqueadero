package com.ceiba.parking.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idregistro")
	private long idRegistro;
	
	private Vehiculo vehiculo;
	
	@Column(name="idubicacion", nullable=false)
	private long idUbicacion;
	
	@Column(name="horaingreso", nullable=false)
	private String horaIngreso;
	
	@Column(name="horasalida", nullable=false)
	private String horaSalida;
	
	@Column(name="total", nullable=false)
	private int total;
	
	@Column(name="estado", nullable=false)
	private int estado;
	
	public Registro(long idRegistro) {
		super();
		this.idRegistro = idRegistro;
	}	

	public Registro(Vehiculo vehiculo, long idUbicacion, String horaIngreso, String horaSalida, int total, int estado) {
		super();
		this.vehiculo = vehiculo;
		this.idUbicacion = idUbicacion;
		this.horaIngreso = horaIngreso;
		this.horaSalida = horaSalida;
		this.total = total;
		this.estado = estado;
	}

	public Registro() {
		super();	
	}

	public long getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(long idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public long getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(long idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public String getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(String horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}
