package com.atqin.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author song
 * @create 2021-07-23 15:57
 */

//@SpringBootApplication注解的意思是告诉我们这个是一个springnoot应用
@SpringBootApplication
public class MainApplication {
  public static void main(String[] args) {
      SpringApplication.run(MainApplication.class,args);

  }

}
