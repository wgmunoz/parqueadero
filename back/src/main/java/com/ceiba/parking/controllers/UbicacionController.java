package com.ceiba.parking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceiba.parking.entities.Ubicacion;
import com.ceiba.parking.services.UbicacionService;

@Controller
@CrossOrigin(origins = {"http://localhost:4200"})
public class UbicacionController {
	@Autowired
	private UbicacionService ubicacionService;
	
	@RequestMapping(value = "/ubicaciones", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Ubicacion> listaRegistros(){
		return ubicacionService.findAll();
	}

	@RequestMapping(value = "/ubicaciones/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Ubicacion> getId(@PathVariable("id") Integer id){
		Ubicacion ubicacion = null;
		try {
			ubicacion = ubicacionService.getUbicacionById(id); 
			if (ubicacion == null) {
				ubicacion = new Ubicacion();
			}
		} catch (Exception e) {
			return new ResponseEntity<>(ubicacion, HttpStatus.INTERNAL_SERVER_ERROR);
		}			
		return new ResponseEntity<>(ubicacion, HttpStatus.OK);
	}
	
	  @RequestMapping(value = "/ubicaciones/create", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)	  
	  @ResponseBody	
	  public String create(@RequestBody Ubicacion ubicacion) {
		  String ubicacionId = "";
	    try {	
	    	ubicacionService.saveUbicacion(ubicacion);
	    	ubicacionId = String.valueOf(ubicacion.getIdUbicacion());
	    }
	    catch (Exception ex) {
	      return "Error creating the ubicacion: " + ex.toString();
	    }
	    return "Ubicacion succesfully created with id = " + ubicacionId;
	  }
	  
	  @RequestMapping("/ubicaciones/delete/{id}")
	  @ResponseBody
	  public String delete(@PathVariable Integer id) {
	    try {	    	
	    	ubicacionService.deleteUbicacion(id);
	    }
	    catch (Exception ex) {
	      return "Error deleting the ubicacion:" + ex.toString();
	    }
	    return "Ubicacion succesfully deleted!";
	  }
	  
	  
}
