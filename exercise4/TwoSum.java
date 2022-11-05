package com.consultadd.exercise4;

import java.util.HashMap;
import java.util.Map;

/*9. Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
        a. Sample array: [1,2,4,5,6]
        b. Target value: 6.*/
public class TwoSum {
    public int[] sumOfTwoElements(int[] arr, int k) {
        //returning indices;
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int remaining = k-arr[i];
            if(map.containsKey(remaining)){
                result[0] = map.get(remaining);
                result[1] = i;
                System.out.println(result[0]);
                System.out.println(result[1]);
                return arr;
            }else{
                map.put(arr[i], i);
            }
        }
        return  arr;
    }
    public static void main(String[] args){
        TwoSum obj = new TwoSum();
        int[] arr = {3, 2, 5, 8, 9, 1, 10, 2, 4, 2, 8, 9};
        int k = 6;
        obj.sumOfTwoElements(arr, k);
    }
}
