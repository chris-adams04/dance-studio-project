package com.cg.service;

import java.util.List;

import com.cg.entity.Feedback;

public interface FeedbackService {
	
	public int addFeedback(Feedback feedback);
	
	public List<Feedback> getFeedback();

}
