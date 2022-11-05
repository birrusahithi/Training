package com.consultadd.exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

//3. Write a JAVA program that takes user input from 1 to 12 for months, and displays the number of days of a particular month. (Shows “Invalid Details“ if incorrect month number will be provided).
public class DaysInMonths {
    public static void main(String[] args) throws IOException {
        DaysInMonths obj = new DaysInMonths();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter number from 1 to 12");
        int month = Integer.parseInt(reader.readLine());
        if(month>12 || month <1){
            System.out.println("Invalid Details");
        }else{
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
            {
                System.out.println("31 Days in this Month");
            }
            else if ( month == 4 || month == 6 || month == 9 || month == 11 )
            {
                System.out.println("30 Days in this Month");
            }
            else
            {
                System.out.println("Either 28 or 29 Days in this Month");
            }

        }
    }
}
