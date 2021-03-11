package edu.kpi.testcourse.logic;

import edu.kpi.testcourse.auth.User;
import edu.kpi.testcourse.store.DataStore;

public class UserLogic {
  private DataStore store;

  UserLogic() {
    store = new DataStore();
  }
  public void createUser(){
//    User user1 = new User("test1@mail.com", "hjhfdks");
//    store.addUser(user1);
  }
  public boolean logIn(){
    // generate a token
    return true;
  }
  public boolean logOut(){
    // delete token
    return true;
  }
}
