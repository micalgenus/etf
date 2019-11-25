package com.micalgenus.etf;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EtfApplication {
  /**
   * Initializing Spring boot application for running period.
   */
  public static void main(String[] args) {
    new SpringApplicationBuilder(EtfApplication.class)
      .properties("spring.config.location=classpath:/application.yml")
      .run(args);
  }
}
