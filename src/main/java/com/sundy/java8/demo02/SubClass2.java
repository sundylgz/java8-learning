package com.sundy.java8.demo02;

public class SubClass2 implements MyFun, MyInterface{


    @Override
    public String getName() {
        return MyFun.super.getName();
    }
}
