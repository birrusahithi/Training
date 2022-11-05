package com.consultadd.exercise4;

//10. Write a Java program to find the two elements from a given array of positive and negative numbers such that their sum is closest to zero.
public class ClosestToZero {
    public int[] closestToZero(int[] arr) {
        int[] result = new int[2];
        int close = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                int diff = 0-sum;
                if(Math.abs(diff)< Math.abs(close)){
                    close =diff;
                    result[0] = arr[i];
                    result[1] = arr[j];
                }
            }
        }
        System.out.println("result[0] : " + result[0] + " ");
        System.out.print("result[1] : " + result[1]);
        return result;
    }

    public static void main(String[] args) {
        ClosestToZero obj = new ClosestToZero();
        int[] arr = {-1, -60, 65, -52, 20, -30, 36, -71, 73};
        obj.closestToZero(arr);
    }
}
