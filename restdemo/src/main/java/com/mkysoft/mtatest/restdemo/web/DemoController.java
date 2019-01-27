package com.mkysoft.mtatest.restdemo.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class DemoController {

  @GetMapping(value = "/test")
  String test() {
    return "hello";
  }
  
}
