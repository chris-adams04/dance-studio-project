package com.cg.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.cg.entity.Booking;
import com.cg.entity.Choreographer;

public interface BookingService {
	
	public int book(Booking bookibng);
	
	public void deleteBooking(int bookingId,int choreographerId);
	
	public int countBookingsForChoreographer(int choreographerId );

	public int countUserBookings(long candidateId );
	
	public List<Booking> getUserBookings(long candidateId);

	//admin
	
	public List<Booking> getAllBookings();

	public void updateBookingStatus(String costumeStatus,int bookingId);

	public void updateCostumeStatus(String bookingStatus,int bookingId);
	
	public void announcceRewards(String rank,String reward,int bookingId);
	
	public void paymentStatus(String feeStatus,int bookingId);

	public List<Integer> getBookingIds();


}
