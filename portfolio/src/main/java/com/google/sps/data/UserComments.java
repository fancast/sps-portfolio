package com.google.sps.data;

import java.util.ArrayList;

public class UserComments {

  private String commentsList = new String();
  private long timestamp;

  public UserComments() {
    this.commentsList = new String();
    this.timestamp = 0;
  }

  public UserComments(String commentsList, long timestamp) {
    this.commentsList = commentsList;
    this.timestamp = timestamp;
  }

}