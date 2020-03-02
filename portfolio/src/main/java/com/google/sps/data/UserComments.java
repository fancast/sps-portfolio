package com.google.sps.data;

import java.util.ArrayList;

public class UserComments {

  private final ArrayList<String> comments = new ArrayList<String>();

  private void addComment(String userComment) {
    comments.add(userComment);
  }
}