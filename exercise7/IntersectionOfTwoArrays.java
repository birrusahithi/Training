package com.consultadd.exercise7;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
        public int[] intersection(int[] arr1, int[] arr2){
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for(int i : arr1){
                set1.add(i);
            }
            for (int j: arr2){
                set2.add(j);
            }
            set1.retainAll(set2);
            int[] result = new int[set1.size()];
            int index =0;
            for(int i: set1){
                result[index] = i;
                System.out.print(result[index] + " ");
                index++;
            }
            return result;
        }
    public static void main(String[] args) {
        int[] arrr1 = {2,3,6,9};
        int[] arr2 = {6, 3};
        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
        obj.intersection(arrr1, arr2);
    }
}
