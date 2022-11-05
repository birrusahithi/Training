package com.consultadd.exercise2;
//1. Write a program in java to perform the following operations
//a. If a number is divisible by 5 it should print "JAVA Training" as a string
//b.  if a number is divisible by 3 it should print "Consultadd" as a string
//c.If a number is divisible by 3 and 5, it should print "Consultadd JAVA Training" as a string
public class Operations {
    public String performOperations(int n){
        System.out.println(n);
        String s = "";
        if(n%3==0 && n%5==0){
            s = "Consultadd Java Training";
        }
        else if(n%5==0){
           s = "JAVA Training";
        }else if(n%3==0){
            s = "Consultadd";

        }
        System.out.println(s);
        return s;
    }
    public static void main(String[] args){
        Operations obj = new Operations();
        obj.performOperations(15);
    }
}
