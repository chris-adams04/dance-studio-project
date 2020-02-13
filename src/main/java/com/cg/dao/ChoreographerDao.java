package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.Choreographer;

@Repository
public interface ChoreographerDao extends JpaRepository<Choreographer, Integer> {

	@Query("SELECT distinct(city) FROM Choreographer c where c.place= :pplace")  
	public List<String> getCities(@Param("pplace") String pplace);
	
	@Query("SELECT distinct(area) FROM Choreographer c where c.place= :place and c.city= :city")
	public List<String> getAreas(@Param("place") String place, @Param("city") String city);
	
	@Query("SELECT distinct(danceType) FROM Choreographer c where c.place= :place and c.city= :city and c.area= :area")
	public List<String> getDanceType(@Param("place") String place,@Param("city") String city, @Param("area") String area);
	
	@Query("SELECT distinct(cName) FROM Choreographer c where c.place= :place and c.city= :city and c.area= :area and c.danceType= :danceType")
	public List<String> getCName(@Param("place") String place,@Param("city") String city, @Param("area") String area, @Param("danceType") String danceType);


	@Query("SELECT c FROM Choreographer c where c.place= :place and c.city= :city and c.area= :area and c.danceType= :danceType")
	public List<Choreographer> getSelectedChoreo(@Param("place") String place,@Param("city") String city, @Param("area") String area, @Param("danceType") String danceType);

	@Modifying(clearAutomatically = true)
	@Query("update Choreographer ch set ch.noOfBookings =:booking where ch.cId =:cid")
	public int updateBookings(@Param("booking") int booking,@Param("cid") int cid);
	
	@Query("SELECT noOfBookings FROM Choreographer c where c.cId= :cid")
	public int getNoOfBookings(@Param("cid") int cid);
	
}
