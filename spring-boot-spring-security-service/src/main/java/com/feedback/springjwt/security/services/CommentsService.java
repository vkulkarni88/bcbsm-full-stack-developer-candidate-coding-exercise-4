package com.feedback.springjwt.security.services;

import java.util.List;

import com.feedback.springjwt.models.Comments;


public interface CommentsService {

	public List<Comments> findAll();

}