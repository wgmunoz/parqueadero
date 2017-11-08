package com.ceiba.parking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.parking.entities.Ubicacion;
import com.ceiba.parking.repositories.UbicacionRepository;

@Service
public class UbicacionServiceImpl implements UbicacionService {

	@Autowired
	private UbicacionRepository ubicacionRepository;
	
	public List<Ubicacion> findAll(){
		return (List<Ubicacion>) ubicacionRepository.findAll();
	}
	
	
	public Ubicacion getUbicacionById(Integer idUbicacion) {
		return ubicacionRepository.findOne(idUbicacion);
	}
	
	
	public Ubicacion saveUbicacion(Ubicacion ubicacion) {
		return ubicacionRepository.save(ubicacion);		
	}
	
	
	public void deleteUbicacion (Integer idUbicacion) {
		ubicacionRepository.delete(idUbicacion);
	}
	
}
