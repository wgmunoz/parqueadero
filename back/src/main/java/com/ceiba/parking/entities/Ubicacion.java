package com.ceiba.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ubicacion")
public class Ubicacion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idubicacion")
	private Integer idUbicacion;
	
	@Column(name = "descripcionubicacion", nullable = false, length=20, unique=true)
	private String descripcionUbicacion;
	
	@Column(name = "tipoubicacion", nullable = false, length=15)
	private String tipoUbicacion;
	
	@Column(name = "estado", nullable = false)
	private Integer estado;
	
	public Ubicacion() {		
	}

	public Ubicacion(Integer idUbicacion, String descripcionUbicacion, String tipoUbicacion, Integer estado) {
		super();
		this.idUbicacion = idUbicacion;
		this.descripcionUbicacion = descripcionUbicacion;
		this.tipoUbicacion = tipoUbicacion;
		this.estado = estado;
	}

	public Integer getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public String getDescripcionUbicacion() {
		return descripcionUbicacion;
	}

	public void setDescripcionUbicacion(String descripcionUbicacion) {
		this.descripcionUbicacion = descripcionUbicacion;
	}

	public String getTipoUbicacion() {
		return tipoUbicacion;
	}

	public void setTipoUbicacion(String tipoUbicacion) {
		this.tipoUbicacion = tipoUbicacion;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}	
	
}
