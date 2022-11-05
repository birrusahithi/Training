package com.consultadd.exercise7;

import java.util.HashMap;
import java.util.Map;

//7. Program to Count occurrences of each character in a string in java?
public class CharOccurrences {
    public Map<Character, Integer> countChars(String s){
     Map<Character, Integer> map = new HashMap<>();
     for(int i=0; i<s.length(); i++){
         char c = s.charAt(i);
         map.put(c, map.getOrDefault(c, 0)+1);
     }
        System.out.println(map);
     return map;
    }
    public static void main(String[] args){
        CharOccurrences obj = new CharOccurrences();
        String k = "occurrences";
        obj.countChars(k);

    }
}
