package com.consultadd.exercise7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//2. Program to find the first non-repeated character in the String
public class NonRepeatedCharacters {
    public char nonRepeatedChar(String s){
        char result = ' ';
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> me : map.entrySet()){
            if(me.getValue()==1){
                result = me.getKey();
                System.out.println("result : " + result);
                return result;
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args){
        NonRepeatedCharacters obj = new NonRepeatedCharacters();
        String s = "aabbcdeffg";
        obj.nonRepeatedChar(s);
    }
}
