package com.consultadd.exercise3;
//4. Write a JAVA program that takes one integer input n from the user, and displays all the so, print sum of n natural numbers.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNaturalNumbers {
    public int sumNaturalNumbers(int n){
        int sum =0;
       for(int i=1; i<=n; i++){
           System.out.print(i + " ");
           sum +=i;
       }
       return sum;
    }
    public static void main(String[] args) throws IOException {
        SumNaturalNumbers obj= new SumNaturalNumbers();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number");
        int number = Integer.parseInt(reader.readLine());
        int sumNaturalNumbers = obj.sumNaturalNumbers(number);
        System.out.println();
        System.out.println("Sum of natural numbers : "+ sumNaturalNumbers);
    }
}
