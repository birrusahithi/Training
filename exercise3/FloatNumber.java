package com.consultadd.exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class FloatNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter float number1 : ");
        String s = reader.readLine();
       String k = String.format("%.2f", Double.valueOf(s));
        float input1 = Float.parseFloat(k);
        String[] arr = s.split(".");
        System.out.println("Enter float number2 : ");
        String second = reader.readLine();
       String inp = String.format("%.2f", Double.valueOf(second));
       float input2 = Float.parseFloat(inp);
        if(input1==input2){
            System.out.println("input one : " + input1);
            System.out.println("input two : " + input2);
            System.out.println("Yes, they are same");
        }else{
            System.out.println("input one : " + input1);
            System.out.println("input two : " + input2);
            System.out.println("They are not same");
        }
    }
}
