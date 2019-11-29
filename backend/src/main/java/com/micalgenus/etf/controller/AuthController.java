package com.micalgenus.etf.controller;

import java.security.Principal;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public Principal home(Principal principal) {
    return principal;
  }

  /**
   * List of authentication.
   */
  @RequestMapping(value = "list", method = RequestMethod.GET)
  public String list() {
    ProcessBuilder pb = new ProcessBuilder();
    Map<String, String> envMap = pb.environment();
    Set<String> keys = envMap.keySet();

    String result = "";
    for (String key : keys) {
      result += (key + " : " + envMap.get(key)) + "\n";
    }

    return result;
  }

}