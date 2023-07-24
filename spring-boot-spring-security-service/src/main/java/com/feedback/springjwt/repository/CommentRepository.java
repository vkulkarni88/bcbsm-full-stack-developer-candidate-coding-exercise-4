package com.feedback.springjwt.repository;

import org.springframework.stereotype.Repository;

import com.feedback.springjwt.models.Comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comments, Long> {

	// List<Comments> findByUsername(String username);

	
}
	
