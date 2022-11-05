package com.consultadd.exercise3;

import com.sun.org.apache.xerces.internal.impl.dv.xs.YearMonthDV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;
import java.time.YearMonth;

public class NoOfDaysInMonths {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter year : ");
        int year = Integer.parseInt(reader.readLine());
        System.out.println("Enter month : ");
        int month = Integer.parseInt(reader.readLine());
        YearMonth ym = YearMonth.of(year, month);
        int days = ym.lengthOfMonth();
        System.out.println(month + year + " has " + days + " days");
    }
}
