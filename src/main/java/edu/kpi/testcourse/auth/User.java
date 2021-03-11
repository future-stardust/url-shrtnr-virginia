package edu.kpi.testcourse.auth;

/**
 *  User.
 *  <p>email - unique email</p>
 *  <p>hash of the user password.</p>
 */
public class User {
  private String email;
  private String hash;
  private int id;

  /**
   *  Constructor.
   *
   * @param email unique string, email of user
   * @param hash hash of the password
   */
  public User(String email, String hash) {
    this.email = email;
    this.hash = hash;
  }

  public String getUserEmail() {
    return email;
  }

  public String getUserHash() {
    return hash;
  }

  public void setId(int i){this.id = i;}

  public int getId(){return id;}

}
