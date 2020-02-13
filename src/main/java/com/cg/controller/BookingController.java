package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Booking;
import com.cg.entity.Choreographer;
import com.cg.service.BookingService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	/**
	 * @parameter is booking
	 * @return booking Id
	 * 
	 * after storing the booking details
	 */
	@PostMapping(value="/book" , consumes = "application/json")
	public int book(@RequestBody Booking booking)
	{
		return bookingService.book(booking);
		
	}
	
	/**
	 * @parameter is bookingId
	 * @parameter is choreographerId
	 * 
	 * delete the booking
	 * and update no of students for choreographer
	 */
	@DeleteMapping(value="/deleteBooking/{bookingId}/{choreographerId}")
	public void deleteBooking(@PathVariable("bookingId") int bookingId,@PathVariable("choreographerId") int choreographerId)
	{
		bookingService.deleteBooking(bookingId,choreographerId);
		
	}
	
	/**
	 * @return list of bookings
	 */
	@GetMapping(value="/getAllBookings" , produces = "application/json")
	public List<Booking> getAllBookings()
	{
		return bookingService.getAllBookings(); 
		
	} 
	

	/**
	 * @parameter is choreographerId
	 * @return number of bookings  for choreographer
	 */
	@GetMapping(value="/countBookings/{choreographerId}" , produces = "application/json")
	public int countBookingsForChoreographer(@PathVariable("choreographerId") int choreographerId)
	{
		return bookingService.countBookingsForChoreographer(choreographerId);
	}
	
	/**
	 * @parameter is candidateId
	 * @return number of user bookings
	 */
	@GetMapping(value="/countUserBookings/{candidateId}" , produces = "application/json")
	public int countUserBookings(@PathVariable("candidateId") long candidateId)
	{
		return bookingService.countUserBookings(candidateId);
	}
	
	/**
	 * @parameter is candidateId
	 * @return booking list
	 */
	@GetMapping(value="/getUserBookings/{candidateId}" , produces = "application/json")
	public List<Booking> getUserBookings(@PathVariable("candidateId") long candidateId)
	{
		return bookingService.getUserBookings(candidateId);
	}
	
	/**
	 * @parameter is bookingStatus
	 * @parameter is bookingId
	 * 
	 * updating the booking status
	 */
	@GetMapping(value="/updateBookingStatus/{bookingStatus}/{bookingId}")
	public void updateBookingStatus(@PathVariable("bookingStatus") String bookingStatus,@PathVariable("bookingId") int bookingId) {
		bookingService.updateBookingStatus(bookingStatus, bookingId);
	}
	
	/**
	 * @parameter is costumeStatus
	 * @parameter is bookingId
	 * 
	 * updating the costume status
	 */
	@GetMapping(value="/updateCostumeStatus/{costumeStatus}/{bookingId}")
	public void updateCostumeStatus(@PathVariable("costumeStatus") String costumeStatus,@PathVariable("bookingId") int bookingId) {
		bookingService.updateCostumeStatus(costumeStatus, bookingId);
	}


	/**
	 * @parameter is rank
	 * @parameter is reward
	 * @parameter is bookingId
	 * 
	 * announcing the winning rank and rewards
	 */
	@GetMapping(value="/anounceRewards/{rank}/{reward}/{bookingId}")
	public void announcceRewards(@PathVariable("rank") String rank,@PathVariable("reward") String reward,@PathVariable("bookingId") int bookingId) {
		bookingService.announcceRewards(rank, reward, bookingId);
	}
	
	
	
	/**
	 * @parameter is feeStatus
	 * @parameter is bookingId
	 * 
	 * updating the fee status
	 */
	@GetMapping(value="/feeStatus/{feeStatus}/{bookingId}")
	public void paymentStatus(@PathVariable("feeStatus") String feeStatus,@PathVariable("bookingId") int bookingId) {
		bookingService.paymentStatus(feeStatus, bookingId);
	}
	
	/**
	 * @return getting all booking id's 
	 */
	@GetMapping(value="/getBookingIds")
	public List<Integer> getBookingIds() {
		return bookingService.getBookingIds();
	}
} 
