package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.FeedbackDao;
import com.cg.entity.Feedback;

@Service
@Transactional
public class FeedbackServiceImpl implements FeedbackService {
	
	@Autowired
	FeedbackDao dao;

	@Override
	public int addFeedback(Feedback feedback) {	
		Feedback feed=dao.save(feedback);
		return feed.getFeedbackId();
	}

	@Override
	public List<Feedback> getFeedback() {	
		return dao.findAll();
	}

}
