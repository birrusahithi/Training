package com.consultadd.exercise4;

import java.util.PriorityQueue;
//3. Write a Java program to find the second smallest element in an array.
public class SecondSmallest {
    public int secondSmallest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2) -> n2-n1);
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        System.out.println(pq.peek());
      return   pq.poll();
    }
    public static void main(String[] args){
        SecondSmallest obj = new SecondSmallest();
        int k = 2;
        int[] arr = {3, 2, 5, 8, 9, 1, 10, 2, 4, 2, 8, 9};
        obj.secondSmallest(arr, k);
    }
}
