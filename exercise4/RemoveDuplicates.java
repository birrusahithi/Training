package com.consultadd.exercise4;
//1. Write a Java program to remove duplicate elements from an array.
import java.util.*;

public class RemoveDuplicates {
    public int[] remove(int[] arr){
        //without sorting
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(!set.contains(arr[i])){
                result.add(arr[i]);
                set.add(arr[i]);
            }
        }
       int[] res = new int[result.size()];
      for(int i=0; i<result.size(); i++){
          res[i] = result.get(i);
          System.out.println(res[i]);
      }
      return res;
    }
    public int[] rem(int[] array){
        //with sorting
        Arrays.sort(array);
        int[] arr = new int[array.length];
        Arrays.fill(arr, -1);
        int j=0;
        for(int i=0; i<array.length-1; i++){
            if(array[i]!=array[i+1]){
                arr[j] = array[i];
                j++;
            }
        }
        for(int i : arr){
            System.out.println("second : "+i);
        }
        return arr;
    }
    public static void main(String[] args){
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] array = {3, 2, 2, 8, 8, 10, 10, 2, 4, 2, 8, 9};
        obj.remove(array);
        obj.rem(array);
    }

}
