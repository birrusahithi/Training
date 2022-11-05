package com.consultadd.exercise7;
//12. Program to find all the subarray whose sum is equal to the given
//number?
public class SubArray {
    public int[] subArray(int[] arr, int n){
        int[] indexes = new int[2];
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int number = arr[i];
            for(int j=i+1; j<arr.length; j++){
                number = number+arr[j];
                if(number==n){
                    indexes[0] = i;
                    indexes[1] = j;
                    System.out.println(" Indexes : " + indexes[0] + "to " + indexes[1]);
                    System.out.print("Values : ");
                    for(int num=0; num<arr.length; num++){
                        if( num >=indexes[0] && num <= indexes[1]){
                            System.out.print(arr[num] + " ");
                        }
                    }
                    return indexes;
                }
            }
        }
        return indexes;
    }
    public static void main(String[] args){
        int number =8;
        int[] arr = {-7, 1, 3, 4, -2, -1, -5, 5, -3, 0, 8, 2};
        SubArray obj = new SubArray();
        obj.subArray(arr, number);

    }
}
