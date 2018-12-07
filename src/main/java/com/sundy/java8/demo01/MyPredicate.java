package com.sundy.java8.demo01;

@FunctionalInterface
public interface MyPredicate<T> {
    public boolean test(T t);
}
