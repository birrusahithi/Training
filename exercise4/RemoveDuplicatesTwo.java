package com.consultadd.exercise4;

import java.util.*;

//8. Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
public class RemoveDuplicatesTwo {
    public int arrayLength(int[] arr){
        //without sort
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(!set.contains(arr[i])){
                list.add(arr[i]);
                set.add(arr[i]);
            }
        }
        System.out.println(list.size());
        return list.size();
    }
    public int length(int[] arr){
        //with sorting
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                list.add(arr[i]);
            }
        }
        System.out.println(list.size());
        return list.size();
    }
    public static void main(String[] args){
        RemoveDuplicatesTwo obj = new RemoveDuplicatesTwo();
        int[] array = {3, 2, 2, 8, 8, 10, 10, 2, 4, 2, 8, 9};
        obj.arrayLength(array);
        obj.length(array);

    }

}

