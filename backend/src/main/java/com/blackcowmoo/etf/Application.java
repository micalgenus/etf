package com.blackcowmoo.etf;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

  /**
   * Initializing Spring boot application for running.
   */
  public static void main(String[] args) {
    new SpringApplicationBuilder(Application.class).properties("spring.config.location=classpath:/application.yml")
        .run(args);
  }
}
