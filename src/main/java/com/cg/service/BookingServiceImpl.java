package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.BookingDao;
import com.cg.entity.Booking;
import com.cg.entity.Choreographer;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingDao bookingDao;
	
	@Autowired
	private ChoreographerService chService;
	
	@Override
	public int book(Booking booking) {
		int noOfBookings=chService.getNoOfBookings(booking.getChoreographerId());
		System.out.println(noOfBookings);
		
		chService.updateBookings(noOfBookings+1, booking.getChoreographerId());
		
		Booking booked=bookingDao.save(booking);
		return booked.getBookingId();
	}
	
	@Override
	public void deleteBooking(int bookingId,int choreographerId) {
		
		int noOfBookings=chService.getNoOfBookings(choreographerId);
		
		chService.updateBookings(noOfBookings-1, choreographerId);
		
		bookingDao.deleteById(bookingId); 
	
	}


	@Override
	public List<Booking> getAllBookings() {
		return bookingDao.findAll();
	}

	@Override
	public int countBookingsForChoreographer(int choreographerId) {
		return bookingDao.countBookingsForChoreographer(choreographerId);
	}

	@Override
	public int countUserBookings(long candidateId) {
		return bookingDao.countUserBookings(candidateId);
	}

	@Override
	public List<Booking> getUserBookings(long candidateId) {
		return bookingDao.getUserBookings(candidateId);
	}

	@Override
	public void updateBookingStatus(String costumeStatus, int bookingId) {
		bookingDao.updateBookingStatus(costumeStatus, bookingId);		
	}
	

	@Override
	public void updateCostumeStatus(String bookingStatus, int bookingId) {
		bookingDao.updateCostumeStatus(bookingStatus, bookingId);		
	}

	@Override
	public void announcceRewards(String rank, String reward, int bookingId) {
		bookingDao.announcceRewards(rank, reward, bookingId);		
	}

	@Override
	public List<Integer> getBookingIds() {
		return bookingDao.getBookingIds();
	}

	@Override
	public void paymentStatus(String feeStatus, int bookingId) {
		bookingDao.paymentStatus(feeStatus, bookingId);		
	}



}
