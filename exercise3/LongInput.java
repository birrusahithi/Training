package com.consultadd.exercise3;
//5. Write a JAVA program that takes long type input from the user, and
//a. Calculate and display the number of digits.
//b. Calculate the sum of all the digits of the input.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class LongInput {
    public int digits(long number){
        int count =0;
        while(number!=0){
            count++;
            number= number/10;
        }
        return count;
    }
    public int sum(long number){
        int sum =0;
        while(number!=0){
            sum +=number%10;
            number = number/10;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        LongInput obj = new LongInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter long value : ");
        long input = Long.parseLong(reader.readLine());
        System.out.println("Input : " + input);
        System.out.println("Number of digits : "+ obj.digits(input));
        System.out.println("Sum of the digits : " + obj.sum(input));

    }
}
