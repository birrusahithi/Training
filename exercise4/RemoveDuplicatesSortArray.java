package com.consultadd.exercise4;
/*
6. Write a program to remove the duplicates from a sorted array, change them into 0 and add 0 in the end.
        a. input: [2,2,3,3,4,4,4,11,11,11,11] b. output:[2,3,4,11,0,0,0,0,0,0,0]
*/
import com.consultadd.exercise5.RemoveSpace;
import com.consultadd.exercise5.RepeatingLetters;

public class RemoveDuplicatesSortArray {
    public int[] duplicateSort(int[] arr){
        int temp =1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                arr[temp] = arr[i];
                temp++;
            }
        }
        while(temp<arr.length){
            arr[temp] = 0;
            temp++;
        }
        System.out.println("After sort");
        for(int i: arr){
            System.out.print(i + " ");
        }
        return arr;
    }
    public static void main(String[] args){
        RemoveDuplicatesSortArray obj = new RemoveDuplicatesSortArray();
        int[] arr = {2, 2, 3, 3, 4, 4, 4, 11, 11, 11, 11};
        System.out.println("Before sort");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        obj.duplicateSort(arr);
    }
}
