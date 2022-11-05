package com.consultadd.exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2. Write a program to print the value given by the user.
public class PrintValue {
    public static void main(String[] args) throws IOException {
        PrintValue obj = new PrintValue();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value");
        String st = reader.readLine();
        int k = Integer.parseInt(st);
        System.out.println(k);
    }
}
