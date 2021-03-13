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

  public void createUser(String email, String hash, int id) {
    User user1 = new User(email, hash, id);
    store.addUser(user1);
  }

  /**
   * LogIn.
   * function deactivation token
   */
  public boolean logIn(String email, String hash, int id) {
    // generate a token
    User user1 = new User(email, hash, id);
    return true;
  }

  /**
   * Logout.
   * function deactivation token
   */
  public boolean logOut(String email, String hash, int id) {
    User user1 = new User(email, hash, id);
    // delete token
    return true;
  }

  public boolean userIDExists(int userID) {
    //...
    //...
    return true;
  }
}
