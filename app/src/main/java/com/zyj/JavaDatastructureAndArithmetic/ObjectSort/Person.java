package com.zyj.JavaDatastructureAndArithmetic.ObjectSort;

/**
 * Created by Administrator on 2017-10-31.
 */

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String lastName,String firstName,int age){
        this.lastName=lastName;
        this.firstName=firstName;
        this.age=age;
    }

    public Person displayPerson(){
        return new Person(lastName,firstName,age);
    }

    public String getLastName(){
        return lastName;
    }
}
