package com.feedback.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.feedback.springjwt.models.FeedBackComment;
import com.feedback.springjwt.repository.CommentRepository;

public class CommentsServiceImpl implements CommentsService {

	@Autowired
	  private CommentRepository commentRepository;
	
	@Override
	public List<FeedBackComment> findAll() {
		// TODO Auto-generated method stub
		 return this.commentRepository.findAll();
	}


}
