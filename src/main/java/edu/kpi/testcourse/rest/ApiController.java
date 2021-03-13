package edu.kpi.testcourse.rest;

import edu.kpi.testcourse.Utils;
import edu.kpi.testcourse.auth.User;
import edu.kpi.testcourse.logic.UserLogic;
import edu.kpi.testcourse.store.DataStore;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

/**
 * REST API controller that provides logic for Micronaut framework.
 */
@Secured(SecurityRule.IS_ANONYMOUS) // IS_AUTHENTICATED
@Controller
public class ApiController {

  private UserLogic userLogic = new UserLogic();

  @Post(value = "/signup", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<Object> signUp(@Body User user) {
    boolean success = true;
    String description = "Account is created";
    int status = 201;
    user.setId(user.getId());
    if("".equals(user.getId())) {
      success = false;
      status = 415;
      description = "Couldn't find a value for parameter 'userID'";
    } else if (userLogic.userIDExists(user.getId())) {
      success = false;
      status = 409;
      description = "User exists";
    }
    else {
      user.setHash(Utils.generateRandomString(12));
      userLogic.createUser(user.getUserEmail(), user.getUserHash(), user.getId());
    }

    String response = Utils.generateAccountResponse(success, description, user.getUserHash());
    return HttpResponse.ok();
  }

  @Post(value = "/urls/shorten", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<Object> shortenUrl(@Body String shortenData) {
    return HttpResponse.ok();
  }


  @Get(value = "/urls", produces = MediaType.APPLICATION_JSON)
  public String[] getUser() {
    return new String[]{"Url array"};
  }

  @Delete(value = "/urls/{alias}")
  public HttpResponse<Object> deleteUrl(@QueryValue String alias) {
    return HttpResponse.ok();
  }
}
