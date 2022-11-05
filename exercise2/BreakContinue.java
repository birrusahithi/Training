package com.consultadd.exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakContinue {
    public static void main(String[] args) throws IOException {
        for(;;){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number1 : ");
            String s = reader.readLine();
            int val = Integer.parseInt(s);
            if (val < 0) {
                System.out.println("It's Over");
                break;
            } else {
                System.out.println("Good Going");
                continue;
            }
        }
    }

}
