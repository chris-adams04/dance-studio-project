package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Feedback;
import com.cg.service.ChoreographerService;
import com.cg.service.FeedbackService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class FeedbackController {

	@Autowired
	private FeedbackService service;
	
	/**
	 * @parameter is feedback
	 * @return feedbackId
	 * 
	 * storing feedbacks
	 */
	@PostMapping(value="/addFeedback" ,consumes = "application/json")
	public int addFeedback(@RequestBody Feedback feedback) {
		return service.addFeedback(feedback);
		
	}
	
	/**
	 * @return list of feedbacks
	 */
	@GetMapping(value="/getFeedback" ,produces = "application/json")
	public List<Feedback> getFeedback(){
		return service.getFeedback();
		
	}
} 
