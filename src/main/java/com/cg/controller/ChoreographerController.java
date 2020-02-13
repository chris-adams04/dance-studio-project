package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Choreographer;
import com.cg.entity.Registration;
import com.cg.service.ChoreographerService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class ChoreographerController {

	@Autowired
	private ChoreographerService cService;
	
	/**
	 * @param choreographer
	 * @return choreographerId
	 */
	@PostMapping(value="/addChoreographer" , consumes = "application/json")
	public int addChoreographer(@RequestBody Choreographer choreographer)
	{
		return cService.addChoreographer(choreographer);
		
	}
	
	/**
	 * @param choreographer
	 * @return update choreographer details
	 */
	@PostMapping(value="/editChoreographer" , consumes = "application/json")
	public boolean editChoreographer(@RequestBody Choreographer choreographer)
	{
		return cService.editChoreographers(choreographer);
		
	}

	/**
	 * @param cId
	 * @return boolean
	 * 
	 * delete choreographer
	 */
	@DeleteMapping(value="/deleteChoreographer/{cId}") 
	public boolean deleteChoreographer(@PathVariable("cId") int cId)
	{
		return cService.deleteChoreographers(cId);
		 
	} 
	
	/**
	 * @return list of choreographers
	 */
	@GetMapping(value="/getChoreographers" , produces = "application/json")
	public List<Choreographer> getChoreographers(){
		
		return cService.getChoreographers();
	}
	
	
	@GetMapping(value="/getCities/{place}" , produces = "application/json")
	public List<String> getCities(@PathVariable("place") String place){
		
		return cService.getCities(place);
	}
	
	@GetMapping(value="/getAreas/{place}/{city}" , produces = "application/json")
	public List<String> getAreas(@PathVariable("place") String place,@PathVariable("city") String city){
		
		return cService.getAreas(place,city);
	}
	
	@GetMapping(value="/getDanceType/{place}/{city}/{area}" , produces = "application/json")
	public List<String> getDanceType(@PathVariable("place") String place,@PathVariable("city") String city,@PathVariable("area") String area){
		
		return cService.getDanceType(place,city,area);
	}
	
	@GetMapping(value="/getcName/{place}/{city}/{area}/{danceType}" , produces = "application/json")
	public List<String> getcName(@PathVariable("place") String place,@PathVariable("city") String city,@PathVariable("area") String area,@PathVariable("danceType") String danceType){
		
		return cService.getCName(place,city,area,danceType);
	}
	
	@GetMapping(value="/getSelectedChoreo/{place}/{city}/{area}/{danceType}" , produces = "application/json")
	public List<Choreographer> getSelectedChoreo(@PathVariable("place") String place,@PathVariable("city") String city,@PathVariable("area") String area,@PathVariable("danceType") String danceType){
		
		return cService.getSelectedChoreo(place,city,area,danceType);
	}
}
