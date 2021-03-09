package edu.kpi.testcourse.data_store;

import edu.kpi.testcourse.auth.Url;
import edu.kpi.testcourse.auth.User;

import java.io.File;

class DataStore  {

  private String fileName;

  public DataStore() {

  }

  public boolean addUser(User user) {
    return true;
  }

  public User getUser(String email) {

    User user = null;
    return user;
  }

  public boolean addShortUrl(Url url) {
   return true;
  }

  public Url getShortUrl(String alias) {
    Url url = null;
    return url;
  }

  public boolean deleteShortUrl(String alias) {

    return true;
  }


  public void clear() {

  }

  private boolean saveToFile(Object src, File dest) {

    return false;
  }

}
