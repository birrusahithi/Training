package com.consultadd.exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8. Write a Java program that takes a year from the user and print whether that year is a leap year or not.
public class LeapYear {
    public boolean calculate(int year){
        if(year%100==0){
            if(year%4==0 && year%400==0){
                return true;
            }else{
                return false;
            }
        }else {
            if(year%4==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        LeapYear obj = new LeapYear();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter Year : ");
        int year = Integer.parseInt(reader.readLine());
        System.out.println("Year : "+ year );
       boolean result = obj.calculate(year);
       if(result) {
           System.out.println(year + " is a Leap Year");
       }else{
           System.out.println(year + " is not Leap Year");
       }


    }
}
