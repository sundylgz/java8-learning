package com.sundy.java8.demo02;


import java.lang.annotation.*;
import java.lang.reflect.Type;

@Repeatable(MyAnnotations.class)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.PARAMETER,ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "sundy";

}
