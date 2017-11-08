package com.ceiba.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registro")
public class Registro {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idregistro")
	private Integer idRegistro;
	@ManyToOne
	@JoinColumn(name = "idvehiculo", nullable = false)
	private Vehiculo vehiculo;	
	@ManyToOne
	@JoinColumn(name = "idubicacion", nullable = false)
	private Ubicacion ubicacion;
	@Column(name = "horaingreso", nullable = false)
	private String horaIngreso;
	@Column(name = "horasalida", nullable = false)
	private String horaSalida;
	@Column(name = "total", nullable = false)
	private Integer total;
	@Column(name = "estado", nullable = false)
	private Integer estado;
	
	public Registro() {				
	}

	public Registro(Integer idRegistro, Vehiculo vehiculo, Ubicacion ubicacion, String horaIngreso, String horaSalida,
			Integer total, Integer estado) {
		super();
		this.idRegistro = idRegistro;
		this.vehiculo = vehiculo;
		this.ubicacion = ubicacion;
		this.horaIngreso = horaIngreso;
		this.horaSalida = horaSalida;
		this.total = total;
		this.estado = estado;
	}

	
	public Integer getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Integer idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
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

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
	
	
}
