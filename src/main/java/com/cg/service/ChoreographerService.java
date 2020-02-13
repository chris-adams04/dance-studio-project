package com.cg.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.Choreographer;

public interface ChoreographerService {

	public int addChoreographer(Choreographer choreographer);
	
	public List<Choreographer> getChoreographers();
	
	
	public List<String> getCities(String place);
	
	public List<String> getAreas(String place, String city);
	
	public List<String> getDanceType(String place, String city, String area);
	
	public List<String> getCName(String place, String city, String area, String danceType);
	
	
	
	public List<Choreographer> getSelectedChoreo(String place, String city, String area, String danceType);
	
	public int updateBookings(int booking, int cid);
	
	public int getNoOfBookings(int cid);
	
	// Methods for Administrator
	
	public boolean editChoreographers(Choreographer choreographer);
	
	public boolean deleteChoreographers(int cId);

}
