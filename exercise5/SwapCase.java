package com.consultadd.exercise5;

public class SwapCase {
    public void swap(String s){
        System.out.println("Before swap : "+ s);
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            char c = arr[i];
            if(Character.isLowerCase(c)){
                arr[i] = Character.toUpperCase(c);
            }else if(Character.isUpperCase(c)){
                arr[i] = Character.toLowerCase(c);
            }
        }
       String result = arr.toString();
        System.out.print("After Swap : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        SwapCase obj = new SwapCase();
        String s = "heLLo WOrLd";
        obj.swap(s);
    }
}
