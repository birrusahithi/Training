package com.consultadd.exercise7;

import java.util.ArrayList;
import java.util.List;
//10. Find all possible combinations of String? (using recursion)
public class Combinations {
       List<String> list = new ArrayList<>();
       int k;
       int n;
       public void combinations(char[] arr, StringBuilder str, int index){
           if(str.length()==k){
               list.add(str.toString());
               return;
           }
           for(int i = index; i<arr.length; i++){
               char c = arr[i];
               str.append(c);
               combinations(arr, str, index+1);
               str.deleteCharAt(str.length()-1);
           }
       }
       public List<String> comb(char[] arr){
           n = arr.length;
           for(k=1; k<=n; k++){
               combinations(arr, new StringBuilder(), 0);
           }
           return list;
       }

   public static void main(String[ ] args){
       Combinations obj = new Combinations();
       String s = "abcd";
       System.out.println("Input : " + s);
       List<String> output = obj.comb(s.toCharArray());
       System.out.println("Output : "+ output);

   }
}


