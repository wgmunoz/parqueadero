package com.ceiba.parking.services;

import java.util.List;

import com.ceiba.parking.entities.Ubicacion;

public interface UbicacionService {

	/**
	 * 
	 * @return
	 */
	List<Ubicacion> findAll();
	
	/**
	 * 
	 * @param idUbicacion
	 * @return
	 */
	Ubicacion getUbicacionById(Integer idUbicacion);
	
	/**
	 * 
	 * @param ubicacion
	 * @return
	 */
	Ubicacion saveUbicacion(Ubicacion ubicacion);
	
	/**
	 * 
	 * @param idUbicacion
	 */
	void deleteUbicacion (Integer idUbicacion);
	
}
