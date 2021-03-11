package edu.kpi.testcourse.store;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;
import edu.kpi.testcourse.auth.Url;
import edu.kpi.testcourse.auth.User;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataStore  {

  private final String fileName = "store.txt";
  private FileWriter fileWriter;
  JSONObject obj = new JSONObject();
  JSONArray users_list = new JSONArray();
  JSONArray links_list = new JSONArray();

  public DataStore() {
    User user1 = new User("test1@mail.com", "hjhfdks");
    addUser(user1);
    User user2 = new User("test2@mail.com", "jdfjkjd");
    addUser(user2);
    saveToFile();

//    JSONArray company = new JSONArray();
//    company.add("Company: Facebook");
//    obj.put("Company List", company);
  }

  public boolean addUser(User user) {
    JSONObject newUser = new JSONObject();
    newUser.put("id", users_list.size());
    newUser.put("email", user.getUserEmail());
    newUser.put("hash", user.getUserHash());
    users_list.add(newUser);
    return true;
  }

  public User getUser(String email) {

    User user = null;
    return null;
  }

  public boolean addShortUrl(Url url) {
    return true;
  }

  public Url getShortUrl(String alias) {
    Url url = null;
    return null;
  }

  public boolean deleteShortUrl(String alias) {

    return true;
  }

  public void clear() {

  }

  private boolean saveToFile() {
    obj.put("users", users_list);
    obj.put("links", links_list);
    try {
//      File file = new File(fileName);
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
