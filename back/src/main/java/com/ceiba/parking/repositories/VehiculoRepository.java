package com.ceiba.parking.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ceiba.parking.entities.Vehiculo;

@Transactional
public interface VehiculoRepository extends CrudRepository<Vehiculo, Integer> {

}
