package com.sundy.java8.demo02;

import org.junit.Test;

import java.lang.reflect.Method;

public class TestMyAnnotations {

    @Test
    public void test() throws NoSuchMethodException {
        Class<TestMyAnnotations> clazz = TestMyAnnotations.class;
        Method method = clazz.getMethod("show");
        MyAnnotation[] myAnnotations = method.getAnnotationsByType(MyAnnotation.class);
        for (MyAnnotation myAnnotation : myAnnotations) {
            System.out.println(myAnnotation);
        }
    }

    @MyAnnotation("a")
    @MyAnnotation("b")
    public void show() {

    }
}
