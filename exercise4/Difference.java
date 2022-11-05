package com.consultadd.exercise4;
/*
7. Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above
*/
public class Difference {
    public int difference(int[] arr){
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int number = arr[i];
            if(number>big){
               big = number;
            }else if(number<small){
                small = number;
            }
        }
        System.out.println(big);
        System.out.println(small);
        System.out.println(big-small);
        return big-small;
    }
    public static void main(String[] args){
        Difference obj = new Difference();
        int[] arr = {3, 2, 5, 8, 9, 1, 10, 2, 4, 2, 8, 9};
        obj.difference(arr);

    }
}
