package com.consultadd.exercise2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FloatingPointNumber {
    public void readNumber(float num){
        if(num==0){
            System.out.println("the number is 0");
        }else if(num<0 ){
            System.out.println("the number is negative");
        }else if(num>0&& num<1){
            System.out.println("the number is positive and small");
        }
        else if(num>0 && num>1000000){
            System.out.println("th number is positive and large");
        }else{
            System.out.println("the number is positive");
        }
    }
    public static void main(String[] args){
        FloatingPointNumber obj = new FloatingPointNumber();
        obj.readNumber(122.454f);
    }
}
