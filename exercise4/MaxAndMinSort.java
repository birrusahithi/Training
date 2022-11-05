package com.consultadd.exercise4;

import java.util.Arrays;
import java.util.Collections;

/*
11. Write a Java program to sort an array of
        positive integers of a given array,
        in the sorted array the value of the first element should be maximum,
        the second value should be the minimum value, the third should be the second maximum, the fourth second be the second minimum and so on.
*/
public class MaxAndMinSort {
    public void sorting(int[] array) {
        Arrays.sort(array);
        System.out.println("Before sort");
        for (int i=0; i<array.length; i++){
            System.out.println (array[i] + " ");
        }
        int[] nums = array.clone();
        int small =0;
        int large = array.length-1;
        for(int i=0; i<array.length; i++){
            int num = i%2;
            if(i%2==0){
                array[i] = nums[large];
                large--;
            }else{
                array[i] = nums[small];
                small++;
            }
        }
        System.out.println("After sort");
        for(int j=0; j<array.length; j++){
            System.out.print(array[j] + " ");
        }
    }
    public static void main(String[] args){
        MaxAndMinSort obj = new MaxAndMinSort();
        int[] array = {3, 2, 8, 10, 4, 9, 6, 1, 5, 13};
        obj.sorting(array);

    }
}
