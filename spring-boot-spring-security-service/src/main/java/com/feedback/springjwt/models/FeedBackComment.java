package com.feedback.springjwt.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_comments")
public class FeedBackComment {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;

	  @Enumerated(EnumType.STRING)
	  
	  private Integer userid;
	  private String username;
	  private String comments;
	  private String rating;
	  private String commentDate;

	  public FeedBackComment() {

	  }
	  
	  public FeedBackComment(String username, String commentDate,String rating,String commentDate1) {
		    this.username = username;
		    this.commentDate = commentDate1;
		    this.rating = rating;
		    this.commentDate = commentDate1;
		    
		  }

	  public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }
	  
	  public Integer getUserId() {
		    return userid;
		  }

		  public void setUserId(Integer userid) {
		    this.userid = userid;
		  }


	  public String getComments() {
	    return comments;
	  }

	  public void setName(String comments) {
	    this.comments = comments;
	  }

}
