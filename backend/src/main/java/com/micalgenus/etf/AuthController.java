package com.micalgenus.etf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

  @RequestMapping(value = "list", method = RequestMethod.GET)
  public int test() {
    return 1;
  }
}