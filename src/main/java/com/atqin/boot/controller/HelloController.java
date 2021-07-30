package com.atqin.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

/**
 * @author song
 * @create 2021-07-23 16:01
 */

//@Controller
//@ResponseBody

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String handle01(){

        return "hello spring boot 2!";
    }



}
