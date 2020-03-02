package com.google.sps.data;

import java.util.ArrayList;

public class UserComments {

  private final ArrayList<String> commentsList = new ArrayList<String>();

  public void addComment(String userComment) {
    commentsList.add(userComment);
  }
}