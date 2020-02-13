package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.cg.dao.RegistrationDao;
import com.cg.entity.Registration;

public interface RegistrationService {

	public boolean register(Registration reg);

	public boolean login(long phnNo, String pwd);
	
	public List<String> getName(long pphoneNo);
	
	public List<String> getUserType(long pphoneNo);

	
}
