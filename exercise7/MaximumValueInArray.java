package com.consultadd.exercise7;
//9. Find the maximum value in Array without using Collection?
public class MaximumValueInArray {
   public int maxValue(int[] arr){
      int max = Integer.MIN_VALUE;
      for(int i: arr){
         if(i>max){
            max = i;
         }
      }
      System.out.println(max);
      return max;
}
   public static void main(String[] args){
      MaximumValueInArray obj = new MaximumValueInArray();
      int[] arr = {3, 2, 5, 8, 9, 1, 10, 2, 4, 2, 8, 9};
      obj.maxValue(arr);
   }
}
