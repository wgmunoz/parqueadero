package com.ceiba.parking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idvehiculo")
	private long idVehiculo;
	
	@Column(name="tipovehiculo", nullable=false, length=15)
	private String tipoVehiculo;
	
	@Column(name="matricula", nullable=false, length=10, unique = true)
	private String matricula;
	
	@Column(name="cilindraje", nullable=false)
	private int cilindraje;
	
	@Column(name="estado", nullable=false)
	private int estado;
	
	public Vehiculo(long idVehiculo) {
		super();
		this.idVehiculo = idVehiculo;
	}

	public Vehiculo(String tipoVehiculo, String matricula, int cilindraje, int estado) {
		super();
		this.tipoVehiculo = tipoVehiculo;
		this.matricula = matricula;
		this.cilindraje = cilindraje;
		this.estado = estado;
	}

	public Vehiculo() {
		super();	
	}

	public long getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(long idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getActivo() {
		return estado;
	}

	public void setActivo(int estado) {
		this.estado = estado;
	}	

}
