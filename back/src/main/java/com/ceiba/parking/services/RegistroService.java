package com.ceiba.parking.services;

import java.util.List;

import com.ceiba.parking.entities.Registro;

public interface RegistroService {

	/**
	 * 
	 * @return
	 */
	List<Registro> findAll();
	
	/**
	 * 
	 * @param idRegistro
	 * @return
	 */
	Registro getRegistroById(Integer idRegistro);
	
	/**
	 * 
	 * @param registro
	 * @return
	 */
	Registro saveRegistro(Registro registro);
	
	/**
	 * 
	 * @param idRegistro
	 */
	void deleteRegistro (Integer idRegistro);
	
	/**
	 * 
	 * @param matricula
	 * @return
	 */
	Registro getRegistroByMatricula(String matricula);
	
	/**
	 * 
	 * @param estado
	 * @return
	 */
	List<Registro> getRegistrosActivos();
	
}
