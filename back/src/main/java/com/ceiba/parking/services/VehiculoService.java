package com.ceiba.parking.services;

import java.util.List;

import com.ceiba.parking.entities.Vehiculo;



public interface VehiculoService {

	/**
	 * 
	 * @return
	 */
	List<Vehiculo> findAll();
	
	/**
	 * 
	 * @param idUbicacion
	 * @return
	 */
	Vehiculo getVehiculoById(Integer idVehiculo);
	
	/**
	 * 
	 * @param ubicacion
	 * @return
	 */
	Vehiculo saveVehiculo(Vehiculo vehiculo);
	
	/**
	 * 
	 * @param idUbicacion
	 */
	void deleteVehiculo(Integer idVehiculo);
}
