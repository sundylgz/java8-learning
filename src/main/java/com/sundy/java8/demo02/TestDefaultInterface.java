package com.sundy.java8.demo02;

public class TestDefaultInterface {
    public static void main(String[] args) {
        SubClass1 sc = new SubClass1();
        System.out.println(sc.getName());
        MyInterface.show();

        SubClass2 sc2 = new SubClass2();
        System.out.println(sc2.getName());
    }

}
