package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.ChoreographerDao;
import com.cg.entity.Choreographer;

@Service
@Transactional
public class ChoreographerServiceImpl implements ChoreographerService {

	@Autowired
	private ChoreographerDao cDao;
	
	@Override
	public int addChoreographer(Choreographer choreographer) {
		
		Choreographer ch=cDao.save(choreographer);
		return ch.getcId();
	}

	@Override
	public List<Choreographer> getChoreographers() {
		
		List<Choreographer> choreographers=cDao.findAll();
		
		return choreographers;
	}

	@Override
	public List<String> getCities(String place) {
		return cDao.getCities(place);
	}

	@Override
	public List<String> getAreas(String place, String city) {
		return cDao.getAreas(place, city);
	}

	@Override
	public List<String> getDanceType(String place, String city, String area) {
		return cDao.getDanceType(place, city, area);
	}

	@Override
	public List<String> getCName(String place, String city, String area, String danceType) {
		return cDao.getCName(place, city, area, danceType);
	}

	@Override
	public List<Choreographer> getSelectedChoreo(String place, String city, String area, String danceType) {
		return cDao.getSelectedChoreo(place, city, area, danceType);
	}

	@Override
	public int updateBookings(int booking, int cid) {
		return cDao.updateBookings(booking, cid);
	}
 
	@Override
	public int getNoOfBookings(int cid) {
		return cDao.getNoOfBookings(cid);
	}

	@Override
	public boolean editChoreographers(Choreographer choreographer) {
		
		Choreographer isPresent=cDao.getOne(choreographer.getcId());
		if(isPresent !=null)
		{
		Choreographer ch=cDao.save(choreographer);
		return true;
		}
		
		else
			return false;
	}

	@Override
	public boolean deleteChoreographers(int cId) {
		Choreographer isPresent=cDao.getOne(cId);
		if(isPresent !=null)
		{
		cDao.deleteById(cId);
		return true;
		}
		
		else
			return false;
	}

	

}
