package edu.kpi.testcourse.auth;

/**
 *  User.
 *  <p>email - unique email</p>
 *  <p>hash of the user password.</p>
 */
public class User {
  private String email;
  private String hash;
  private int userID;

  /**
   *  Constructor.
   *
   * @param email unique string, email of user
   * @param hash hash of the password
   */
  public User(String email, String hash, int userID) {
    this.email = email;
    this.hash = hash;
    this.userID = userID;
  }

  public String getUserEmail() {
    return email;
  }

  public String getUserHash() {
    return hash;
  }

  public void setId(int id) {
    this.userID = id;
  }

  public int getId() {
    return userID;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }
}
