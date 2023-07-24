package com.feedback.springjwt.payload.request;

import java.util.Set;

import jakarta.validation.constraints.*;

public class CommentRequest {
  @NotBlank
  @Size(min = 3, max = 20)
  private String username;

  private String rating;

  private String comment;

  private String commentdate;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

public String getRating() {
	return rating;
}

public void setRating(String rating) {
	this.rating = rating;
}

public String getComment() {
	return comment;
}

public void setComment(String comment) {
	this.comment = comment;
}

public String getCommentdate() {
	return commentdate;
}

public void setCommentdate(String commentdate) {
	this.commentdate = commentdate;
}


}
