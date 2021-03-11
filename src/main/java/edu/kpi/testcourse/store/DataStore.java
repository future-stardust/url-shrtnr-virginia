package edu.kpi.testcourse.store;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;
import edu.kpi.testcourse.auth.Url;
import edu.kpi.testcourse.auth.User;
import java.io.FileWriter;
import java.io.IOException;

/**
 * DataStore.
 */
public class DataStore  {

  private final String fileName = "store.txt";
  private FileWriter fileWriter;
  JSONObject obj = new JSONObject();
  JSONArray usersList = new JSONArray();
  JSONArray linksList = new JSONArray();

  /**
   * Constructor.
   */
  public DataStore() {
    User user1 = new User("test1@mail.com", "hjhfdks");
    //    addUser(user1);
    //    User user2 = new User("test2@mail.com", "jdfjkjd");
    //    addUser(user2);
    Url url1 = new Url("bla.bl", "blablabla.bla", user1);
    //    Url url2 = new Url("bla1.bl", "blablablablabla.bla", user1);
    //    addShortUrl(url1);
    //    addShortUrl(url2);
    saveToFile();
  }

  /**
   *  AddUser.
   *  add user to data store
   */
  public boolean addUser(User user) {
    user.setId(usersList.size());
    JSONObject newUser = new JSONObject();
    newUser.put("id", usersList.size());
    newUser.put("email", user.getUserEmail());
    newUser.put("hash", user.getUserHash());
    usersList.add(newUser);
    return true;
  }

  /**
   * AddShortUrl.
   * function
   */
  public boolean addShortUrl(Url url) {
    JSONObject newLink = new JSONObject();
    newLink.put("id", linksList.size());
    newLink.put("userId", url.getUser().getId());
    newLink.put("link", url.getUrl());
    newLink.put("short_link", url.getAlias());
    linksList.add(newLink);
    return true;
  }

  public String getShortUrl(String url) {
    return "";
  }

  public boolean deleteShortUrl(String url) {

    return true;
  }

  public void clear() {

  }

  private boolean saveToFile() {
    obj.put("users", usersList);
    obj.put("links", linksList);
    try {
      //File file = new File(fileName);
      fileWriter = new FileWriter(fileName);
      fileWriter.write(obj.toJSONString());
      fileWriter.close();
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }
}
