package com.consultadd.exercise3;

import java.io.OutputStream;

/*
6. Write a program that accepts three numbers from the user and prints "INCREASING" if the numbers are in increasing order, "DECREASING" if the numbers are in decreasing order, and "Neither increasing nor decreasing order" otherwise. FOR eg.
        ● Input first number: 1524
        ● Input second number: 2345
        ● Input third number: 3321
*/
public class IncreaseDecrease {
    public String incOrDec(int first, int second, int third){
        String s = "";
        if(first<second && second<third){
            s = "INCREASING";
        }else if(first>second && second>third){
            s = "DECREASING";
        }else{
            s = "Neither increasing nor decreasing order";
        }
        return s;
    }
    public static void main(String[] args){
        IncreaseDecrease obj = new IncreaseDecrease();
        String result = obj.incOrDec(1524, 2345, 3321);
        System.out.println("Output 1 : " + result);
        String result2 = obj.incOrDec(3321, 2345, 1524);
        System.out.println("Output 2 : " + result2);
        String result3 = obj.incOrDec(2345, 3321, 1524);
        System.out.println("Output 3 : " + result3);
    }
}
