package com.consultadd.exercise5;
//2. Write a JAVA program that gives the sum of all the values of the array except the highest and lowest values.
public class SumOfValues {
    public int sumVales(int[] arr){
        int highcount =1;
        int lowcount =1;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int total = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=highest){
                if(arr[i]==highest){
                    highcount++;
                }else {
                    highest = arr[i];
                    highcount = 1;
                }
            }else if(arr[i]<=lowest){
                if(arr[i]==lowest){
                    lowcount++;
                }else {
                    lowest = arr[i];
                    lowcount = 1;
                }
            }
            total += arr[i];
        }
        System.out.println("highest : "+ highest);
        System.out.println("highcount : "+ highcount);
        System.out.println("lowcount :" +lowcount);
        System.out.println("lowest :" + lowest);
        System.out.println(total);
        total = total - ((highest * highcount )+(lowest*lowcount));
        System.out.println(total);
        return total;
    }
    public static void main(String[] args){
        SumOfValues obj = new SumOfValues();
        int[] array = {3, 2, 2, 8, 8, 10, 10, 2, 4, 2, 8, 9};
        obj.sumVales(array);
    }
}
