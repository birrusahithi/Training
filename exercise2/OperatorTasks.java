package com.consultadd.exercise2;
/*2. Write a program in JAVA to perform the following operator based tasks:
        ● Ask the user to choose the following option first:
        ○ If User Enter 1 - Addition
        ○ If User Enter 2 - Subtraction
        ○ If User Enter 3 - Division
        ○ If User Enter 4 - Multiplication
        ○ If User Enter 5 - Average
        2

        ● Ask the user to enter the 2 numbers in a variable for first and second(first and second are variable names) for the first 4 options mentioned above and print the result.
        ● Ask the user to enter two more numbers as first1 and second2 for calculating the average as soon as the user chooses option 5.
        ● At the end, if the answer of any operation is Negative print a statement saying “Oops option X(1/2/3/4/5/) is returning the negative number”
        ● NOTE: At a time a user can perform one action at a time.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorTasks {
    public int addition(int first, int second){
        int sum = first+second;
        return sum;
    }
    public int subtraction(int first, int second){
        int sub = first-second;
        return sub;
    }
    public int division(int first, int second){
        int div = first/second;
        return div;
    }
    public int multiplication(int first, int second){
        int multiplication = first*second;
        return multiplication;
    }
    public int avg(int first, int second){
        int sum = addition(first, second);
        int avg = sum/2;
        return avg;
    }
    public static void main(String[] args) throws IOException {
        OperatorTasks obj = new OperatorTasks();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number");
        String s = reader.readLine();
        int first = Integer.parseInt(s);
        System.out.println("Enter second number");
        String l = reader.readLine();
        int second = Integer.parseInt(l);
        int addition = obj.addition(first, second);
        System.out.println("addition : "+ addition);
        int subtraction = obj.subtraction(first, second);
        System.out.println("subtraction : " + subtraction);
        int division = obj.division(first, second);
        System.out.println("Division: " + division);
        int multiplication = obj.multiplication(first, second);
        System.out.println("Muliplication : " + multiplication);
        int average = obj.avg(first, second);
        System.out.println("Average : " + average);
        if(addition < 0 ){
            System.out.println( "Oops option 1 is returning the negative number");
        }else if(subtraction<0){
            System.out.println( "Oops option 2 is returning the negative number");
        }else if(division<0){
            System.out.println( "Oops option 3 is returning the negative number");
        }else if(multiplication<0){
            System.out.println( "Oops option 4 is returning the negative number");
        }else{
            System.out.println( "Oops option 5 is returning the negative number");
        }

    }
}
