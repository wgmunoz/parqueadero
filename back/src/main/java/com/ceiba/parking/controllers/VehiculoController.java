package com.ceiba.parking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceiba.parking.entities.Vehiculo;
import com.ceiba.parking.services.VehiculoService;

@Controller
public class VehiculoController {
	@Autowired
	private VehiculoService vehiculoService;
	
	@RequestMapping(value = "/vehiculos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Vehiculo> listaRegistros(){
		return vehiculoService.findAll();
	}

	@RequestMapping(value = "/vehiculos/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Vehiculo> getId(@PathVariable("id") Integer id){
		Vehiculo vehiculo = null;
		try {
			vehiculo = vehiculoService.getVehiculoById(id); 
			if (vehiculo == null) {
				vehiculo = new Vehiculo();
			}
		} catch (Exception e) {
			return new ResponseEntity<>(vehiculo, HttpStatus.INTERNAL_SERVER_ERROR);
		}			
		return new ResponseEntity<>(vehiculo, HttpStatus.OK);
	}
	
	  @RequestMapping(value = "/vehiculos/create", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)	  
	  @ResponseBody	
	  public String create(@RequestBody Vehiculo vehiculo) {
		  String vehiculoId = "";
	    try {	
	    	vehiculoService.saveVehiculo(vehiculo);
	    	vehiculoId = String.valueOf(vehiculo.getIdVehiculo());
	    }
	    catch (Exception ex) {
	      return "Error creating the vehiculo: " + ex.toString();
	    }
	    return "Vehiculo succesfully created with id = " + vehiculoId;
	  }
	  
	  @RequestMapping("/vehiculos/delete/{id}")
	  @ResponseBody
	  public String delete(@PathVariable Integer id) {
	    try {	    	
	    	vehiculoService.deleteVehiculo(id);
	    }
	    catch (Exception ex) {
	      return "Error deleting the vehiculo:" + ex.toString();
	    }
	    return "Vehiculo succesfully deleted!";
	  }
	  
	  
}
