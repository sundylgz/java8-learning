package com.sundy.java8.demo01;

public class FilterEmployeeForAge implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() >= 35;
    }
}
