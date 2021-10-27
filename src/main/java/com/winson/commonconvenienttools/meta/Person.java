package com.winson.commonconvenienttools.meta;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {
    private String name;
    private int age;
    private String hobby;
    private  transient  String phone;
    public   static   String address;

}
