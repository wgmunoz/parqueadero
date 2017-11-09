package com.ceiba.parking.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ceiba.parking.entities.Registro;

@Transactional
public interface RegistroRepository extends CrudRepository<Registro, Integer> {
	
	/**
	 * 	
	 * @param estado
	 * @return
	 */
	@Query("SELECT R FROM Registro R WHERE R.estado = :estado")	 
	public List<Registro> findRegistrosActivos(@Param("estado") Integer estado);
	
	/**
	 * 
	 * @param matricula
	 * @return
	 */	
	@Query("SELECT R FROM Registro R join R.vehiculo V WHERE V.matricula = :matricula AND R.estado = :estado")
	public Registro findRegistroByMatricula(@Param("matricula") String matricula,@Param("estado") Integer estado);
}
