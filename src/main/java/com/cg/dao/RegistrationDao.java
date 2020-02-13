package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.Registration;

@Repository
public interface RegistrationDao extends JpaRepository<Registration, Long> {

	@Query("SELECT DISTINCT(name) FROM Registration reg where reg.phoneNo =  :pphoneNo")
	public List<String> getName(@Param("pphoneNo") long pphoneNo);
	
	@Query("SELECT userType FROM Registration reg where reg.phoneNo =  :pphoneNo")
	public List<String> getUserType(@Param("pphoneNo") long pphoneNo);

}
