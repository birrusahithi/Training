package com.consultadd.exercise6;
/*
6. Create a class named 'Programming'. While creating an object of the class,
        if nothing is passed to it, then the message "I love programming languages" should be printed.
        If some String is passed to it, then in place of "programming languages"
        the name of that String variable should be printed.
        For example, while creating an object
        if we pass "Java", then "I love Java" should be printed.
        There can be more than one programming language.
*/
public class Programming{
    String message= "I love";
    Programming(){
        message = message + " "+ "Programming languages";
    }
    Programming(String s){
        message = message+ " " + s;
    }
    public static void main(String[] args){
        Programming obj = new Programming();
        Programming obj1 = new Programming("Java");
        System.out.println(obj.message);
        System.out.println(obj1.message);
    }
}
