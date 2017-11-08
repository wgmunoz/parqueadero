package com.ceiba.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idvehiculo")
	private Integer idVehiculo;
	@Column(name = "tipovehiculo", nullable = false, length=15)
	private String tipoVehiculo;
	@Column(name = "matricula", nullable = false, length=10, unique= true)
	private String matricula;
	@Column(name = "cilindraje", nullable = false)
	private Integer cilindraje;
	@Column(name = "estado", nullable = false)
	private Integer estado;
		
	
	public Vehiculo() {		
	}

	public Vehiculo(Integer idVehiculo, String tipoVehiculo, String matricula, Integer cilindraje, Integer estado) {
		super();
		this.idVehiculo = idVehiculo;
		this.tipoVehiculo = tipoVehiculo;
		this.matricula = matricula;
		this.cilindraje = cilindraje;
		this.estado = estado;
	}

	public Integer getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
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

	public Integer getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(Integer cilindraje) {
		this.cilindraje = cilindraje;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
	
}
