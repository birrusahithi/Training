package com.consultadd.exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*3. Write a program to complete the task given below:
        ● Ask the user to enter any 2 numbers in between 1-10 and add both of them to another variable called z.
        ● Use z for adding 30 into it and print the final result by using variable results.*/
public class CompleteTask {
    public void add(int first, int second){
        int z = first+second+30;
        System.out.println("Total : " + z);
    }
    public static void main(String[] args) throws IOException {
        CompleteTask obj= new CompleteTask();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first value");
        System.out.println("Enter second value");
        String first =reader.readLine();
        int k = Integer.parseInt(first);
        String second = reader.readLine();
        int l = Integer.parseInt(second);
        if((k>=1  && k<=10) && ( l>=1 &&  l<=10)){
            obj.add(k, l);
        }else{
            System.out.println("Please enter value between 1 and 10");
        }

    }
}
