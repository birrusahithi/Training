package com.consultadd.exercise2;

import java.util.ArrayList;
import java.util.List;

//5. Write a program that print all the numbers from 0 to 6 except 3 and 6
//Expected output: 01245
public class PrintAllNumbers {
    public List<Integer> printNumbers(int x){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=x; i++){
            if(i!=3 && i!=6){
                list.add(i);
            }
        }
        System.out.println(list);
        return  list;
    }
    public static void main(String[] args){
        PrintAllNumbers obj = new PrintAllNumbers();
        obj.printNumbers(6);
    }
}
