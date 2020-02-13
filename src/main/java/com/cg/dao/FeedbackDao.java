package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Choreographer;
import com.cg.entity.Feedback;

public interface FeedbackDao extends JpaRepository<Feedback, Integer>{

}
