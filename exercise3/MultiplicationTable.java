package com.consultadd.exercise3;

import java.sql.SQLOutput;

/*1. Write a simple program to print a multiplication table of a certain number taken from the user,
        For eg. 2 X 1 = 2 2X2=4
        and so on.*/
public class MultiplicationTable {
    public void table(int n){
        for(int i =1 ; i<=12; i++){
            System.out.println(n + " " + "*" + " " + i +" "+  "=" + " "+ n*i);
        }
    }
    public static void main(String[] args){
        MultiplicationTable obj = new MultiplicationTable();
        obj.table(8);
    }

}
