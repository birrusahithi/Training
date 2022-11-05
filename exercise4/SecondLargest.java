package com.consultadd.exercise4;

import java.util.PriorityQueue;

//2. Write a Java program to find the second largest element in an array.
public class SecondLargest {
    public int secondElement(int[] arr, int k){
        PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        System.out.println(pq.peek());
        return pq.poll();
    }
    public static void main(String[] args){
        SecondLargest obj = new SecondLargest();
        int[] arr = {3, 2, 5, 8, 9, 1, 10, 2, 4, 2, 8, 9};
        int largest = 2;
        obj.secondElement(arr, largest);
    }
}
