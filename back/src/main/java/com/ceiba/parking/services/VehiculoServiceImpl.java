package com.ceiba.parking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.parking.entities.Vehiculo;
import com.ceiba.parking.repositories.VehiculoRepository;
@Service
public class VehiculoServiceImpl implements VehiculoService{
	
	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	public List<Vehiculo> findAll(){
		return (List<Vehiculo>) vehiculoRepository.findAll();	
	}
	
	public Vehiculo getVehiculoById(Integer idVehiculo) {
		return vehiculoRepository.findOne(idVehiculo);
	}
	
	public Vehiculo saveVehiculo(Vehiculo vehiculo) {
		return vehiculoRepository.save(vehiculo);	
	}
	
	public void deleteVehiculo(Integer idVehiculo) {
		vehiculoRepository.delete(idVehiculo);
	}
}
