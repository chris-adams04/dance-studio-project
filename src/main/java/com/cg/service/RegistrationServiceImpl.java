package com.cg.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.RegistrationDao;
import com.cg.entity.Registration;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationDao dao;
	
	@Override
	public boolean register(Registration reg) {	
		long phoneNo=reg.getPhoneNo();
		boolean existedReg = dao.existsById(phoneNo);
		
		if(existedReg == false)
		{
			dao.save(reg);
			return true;
		}
		else
		{
			return false;
		}	 
	}
	
	@Override
	public boolean login(long phnNo,String pwd) {
		boolean existedReg=dao.existsById(phnNo);
		
	if(existedReg)	
		{
			Registration reg=dao.getOne(phnNo);
				
				if(reg.getPassword().equals(pwd))
					return true;
				else
					return false;
		}
	else
		return false;

	}

	@Override
	public List<String> getName(long pphoneNo) {
		return dao.getName(pphoneNo);
	}

	@Override
	public List<String> getUserType(long pphoneNo) {
		return dao.getUserType(pphoneNo);
	}


}
