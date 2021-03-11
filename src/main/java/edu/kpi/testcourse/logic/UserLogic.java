package edu.kpi.testcourse.logic;

import edu.kpi.testcourse.auth.User;
import edu.kpi.testcourse.store.DataStore;

/**
 * UserLogic.
 */
public class UserLogic {
  private DataStore store;

  /**
   * Constructor.
   *
   */
  public UserLogic() {
    store = new DataStore();
  }

  public void createUser() {
    User user1 = new User("test1@mail.com", "hjhfdks");
    store.addUser(user1);
  }

  /**
   * LogIn.
   * function deactivation token
   */
  public boolean logIn() {
    // generate a token
    User user1 = new User("test1@mail.com", "hjhfdks");
    return true;
  }

  /**
   * Logout.
   * function deactivation token
   */
  public boolean logOut() {
    User user1 = new User("test1@mail.com", "hjhfdks");
    // delete token
    return true;
  }
}
