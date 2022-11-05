package com.consultadd.exercise5;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {
    public int evenInOdd(List<Integer> list){
        int even = -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)%2==0){
                even = list.get(i);
                return list.get(i);
            }
        }
       return even;
    }
    public int oddInEven(List<Integer> list){
        int odd = -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)%2!=0){
                odd = list.get(i);
            }
        }
        return odd;
    }
    public static void main(String[] args){
        EvenOdd obj = new EvenOdd();
        List<Integer> odd = new ArrayList<>();
        odd.add(23);
        odd.add(25);
        odd.add(75);
        odd.add(87);
        odd.add(47);
        odd.add(1);
        odd.add(19);
        odd.add(2);
        int evenInOddResult  = obj.evenInOdd(odd);
        System.out.println("evenInOddResult : " + evenInOddResult);
        List<Integer> even = new ArrayList<>();
        even.add(22);
        even.add(44);
        even.add(64);
        even.add(76);
        even.add(98);
        even.add(43);
        int oddInEvenResult = obj.oddInEven(even);
        System.out.println("oddInEvenResult : "+ oddInEvenResult);

    }
}
