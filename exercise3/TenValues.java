package com.consultadd.exercise3;

/*2. Write a program in which:
        a. Take 10 values input from the user using a loop.
        b. Prints sum of all the numbers provided
        c. Prints the average of those 10 values
        */
import java.util.ArrayList;
import java.util.List;

public class TenValues {
    List<Integer> list = new ArrayList<>();
    int total;
    public void acceptTenValues(int i){
        if(list.size()<=10){
            list.add(i);
        }
    }
    public int sumOfValues(List<Integer> list){
        int sum = 0;
        for(int i: list){
            sum += i;
        }
        this.total = sum;
        return sum;
    }
    public int average(List<Integer> list){
        int average = total/list.size();
        return average;
    }
    public static void main(String[] args){
        TenValues obj = new TenValues();
        obj.acceptTenValues(9);
        obj.acceptTenValues(3);
        obj.acceptTenValues(3);
        obj.acceptTenValues(3);
        obj.acceptTenValues(0);
        obj.acceptTenValues(10);
        obj.acceptTenValues(1);
        obj.acceptTenValues(2);
        obj.acceptTenValues(3);
        obj.acceptTenValues(4);
        obj.acceptTenValues(8);
        System.out.println(obj.list);
     int sum = obj.sumOfValues(obj.list);
        System.out.println("Sum : "+ sum);
     int avg =   obj.average(obj.list);
        System.out.println("avg : "+ avg);
    }
}
