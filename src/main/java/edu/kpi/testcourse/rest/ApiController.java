package edu.kpi.testcourse.rest;

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


  @Post(value = "/urls/shorten", consumes = MediaType.APPLICATION_JSON)
  public HttpResponse<Object> shortenUrl(@Body String shortenData) {
    return HttpResponse.ok();
  }


  @Get(value = "/urls", produces = MediaType.APPLICATION_JSON)
  public String[] getUserUrls() {
    return new String[]{"Url array"};
  }

  @Delete(value = "/urls/{alias}")
  public HttpResponse<Object> deleteUrl(@QueryValue String alias) {
    return HttpResponse.ok();
  }
}
