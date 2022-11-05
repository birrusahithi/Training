package com.consultadd.exercise7;

import java.util.HashSet;
import java.util.Set;

//4. Program to find if String has all Unique Characters?
public class UniqueCharacters {
    public boolean uniqueCharacter(String s){
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                System.out.println("False");
                return false;
            }else{
                set.add(ch);
            }
        }
        System.out.println("true");
        return true;
    }
    public static void main(String[] args){
        UniqueCharacters obj = new UniqueCharacters();
        String k = "string";
        obj.uniqueCharacter(k);
        obj.uniqueCharacter("characters");
    }
}
