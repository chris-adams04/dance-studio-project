package com.cg.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Registration;
import com.cg.service.RegistrationService;

@CrossOrigin(origins = {"http://localhost:4200"})

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService service;
	
	
	/**
	 * @param reg
	 * @return boolean
	 * 
	 * storing the registered user details
	 */
	@PostMapping(value="/register" , consumes = "application/json")
	public boolean register(@RequestBody Registration reg)
	{
		return service.register(reg);
		
	}
	
	
	/**
	 * @param uName
	 * @param pwd
	 * @return boolean
	 * 
	 * returns true if the credentials are true
	 * else false
	 */
	@GetMapping(value="/login/{uName}/{pwd}")
	public boolean login(@PathVariable("uName") long uName,@PathVariable("pwd") String pwd)
	{
		boolean valid=service.login(uName,pwd); 
		return valid;
			
	}
	
	/**
	 * @param phoneNum
	 * @return list of user names
	 */
	@GetMapping(value="/getName/{phoneNum}")
	public List<String> getName(@PathVariable("phoneNum") long phoneNum)
	{
		return service.getName(phoneNum);
		
	}
	
	/**
	 * @param phoneNum
	 * @return list of user Types
	 */
	@GetMapping(value="/getUserType/{phoneNum}")
	public List<String> getUserType(@PathVariable("phoneNum") long phoneNum)
	{
		return service.getUserType(phoneNum);
	 
	}
}
