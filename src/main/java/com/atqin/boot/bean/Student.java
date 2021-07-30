package com.atqin.boot.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author song
 * @create 2021-07-30 10:12
 */
@Data
public class Student {
    private String name;
    private int age;


}
