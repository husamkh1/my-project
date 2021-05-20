package com.example.myproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleConteoller {
  @RequestMapping("/")
    public String index(){
      return "hello ";
  }



}
