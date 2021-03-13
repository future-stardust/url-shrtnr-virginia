package edu.kpi.testcourse.auth;

/**
 *  Url:
 *  <p>shortUrl - unique key, shortened url;</p>
 *  <p>url - full url;</p>
 *  <p>user - email of the user, that created this shortUrl</p>.
 */
public class Url {
  private String shortUrl;
  private String url;
  private User userID;

  /**
   * Constructor.
   *
   * @param shortUrl unique key, short name for the url
   * @param url full url
   * @param user user that created this shortUrl
   */
  public Url(String shortUrl, String url, User user) {
    this.shortUrl = shortUrl;
    this.url = url;
    this.userID = user;
  }

  public String getAlias() {
    return shortUrl;
  }

  public String getUrl() {
    return url;
  }

  public User getUser() {
    return userID;
  }
}
