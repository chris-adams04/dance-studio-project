package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.Booking;

@Repository
public interface BookingDao extends JpaRepository<Booking, Integer> {
	
	@Query("select count(choreographerId) from Booking as booked where choreographerId = :choreographerId group by :choreographerId")
	public int countBookingsForChoreographer(@Param("choreographerId") int choreographerId );
	
	@Query("select count(candidateId) from Booking as booked where candidateId = :candidateId group by :candidateId")
	public int countUserBookings(@Param("candidateId") long candidateId );
	
	@Query("select b from Booking b where b.candidateId= :candidateId")
	public List<Booking> getUserBookings(@Param("candidateId") long candidateId);
	 
	@Modifying(clearAutomatically = true)
	@Query("update Booking b set b.bookingStatus = :bookingStatus where b.bookingId =:bookingId")
	public void updateBookingStatus(@Param("bookingStatus") String costumeStatus,@Param("bookingId") int bookingId);
	
	@Modifying(clearAutomatically = true)
	@Query("update Booking b set b.costumeStatus= :costumeStatus where b.bookingId =:bookingId")
	public void updateCostumeStatus(@Param("costumeStatus") String bookingStatus,@Param("bookingId") int bookingId);
	
	@Modifying(clearAutomatically = true)
	@Query("update Booking b set b.rank = :rank , b.reward= :reward where b.bookingId =:bookingId")
	public void announcceRewards(@Param("rank") String rank,@Param("reward") String reward,@Param("bookingId") int bookingId);
	
	@Modifying(clearAutomatically = true)
	@Query("update Booking b set b.feeStatus = :feeStatus where b.bookingId =:bookingId")
	public void paymentStatus(@Param("feeStatus") String feeStatus,@Param("bookingId") int bookingId);
	
	
	@Query("select b.bookingId from Booking b")
	public List<Integer> getBookingIds();

}
