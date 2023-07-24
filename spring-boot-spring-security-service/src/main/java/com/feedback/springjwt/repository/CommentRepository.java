package com.feedback.springjwt.repository;

import org.springframework.stereotype.Repository;

import com.feedback.springjwt.models.FeedBackComment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<FeedBackComment, Long> {

	// List<Comments> findByUsername(String username);

	
}
	
