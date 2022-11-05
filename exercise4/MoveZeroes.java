package com.consultadd.exercise4;

public class MoveZeroes {
    public void moveZeroes(int[] array){
        int num =0;
        for(int i=0; i<array.length; i++){
            if(array[i]!=0){
                array[num] = array[i];
                num++;
            }
        }
        while(num<array.length){
            array[num] = 0;
            num++;
        }
        System.out.println("After Swap :");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args){
        MoveZeroes obj = new MoveZeroes();
        int[] arr = {2, 0, 1, 0, 3, 1, 0, 5, 4, 9};
        System.out.println("Before Swap :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        obj.moveZeroes(arr);
    }
}
