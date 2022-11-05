package com.consultadd.exercise2;
/*
8. Write a JAVA program that takes character input from the user
-if the character is from r, a, n, d, o, m (consider both upper and lower cases), then print FOUND.
-print not found for all the other alphabets
*/

import java.util.HashSet;
import java.util.Set;

public class RandomCharacter {
    Set<Character> set = new HashSet<>();
    public String random(char c){
        String result = "";
        if(Character.isLowerCase(c) && set.contains(c)){
            result = "FOUND";
        }else {
               char ck = Character.toLowerCase(c);
               if(set.contains(ck)){
                   result = "FOUND";
           }else{
                   result = "NOT FOUND";
               }
        }
        System.out.println(result);
        return  result;
    }
    public static void main(String[] args){
        RandomCharacter obj = new RandomCharacter();
        char[] arr = {'r', 'a', 'n', 'd', 'o', 'm'};
        for(int i=0; i<arr.length; i++){
            obj.set.add(arr[i]);
        }
        char k = 'L';
        obj.random(k);
    }
}
