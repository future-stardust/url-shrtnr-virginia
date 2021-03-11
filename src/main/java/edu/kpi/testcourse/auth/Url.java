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
  private String user;

  /**
   * Constructor.
   *
   * @param shortUrl unique key, short name for the url
   * @param url full url
   * @param user email of user that created this shortUrl
   */
  public Url(String shortUrl, String url, String user) {
    this.shortUrl = shortUrl;
    this.url = url;
    this.user = user;
  }

  public String getAlias() {
    return shortUrl;
  }

  public String getUrl() {
    return url;
  }

  public String getUser() {
    return user;
  }
}
