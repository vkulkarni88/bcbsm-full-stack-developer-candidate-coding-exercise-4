package com.feedback.springjwt.security.services;

import java.util.List;

import com.feedback.springjwt.models.FeedBackComment;


public interface CommentsService {

	public List<FeedBackComment> findAll();

}
