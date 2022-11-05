package com.consultadd.exercise5;

import java.util.HashSet;
import java.util.Set;

/*4. Write a JAVA method to return a boolean true if the string doesn’t have repeating letters and consecutive or nonconsecutive i.e. all the letters of the string be unique (isogram) else false.
        a. Write a JAVA program that reverses the words of a sentence.
        i. For eg, => “Be Happy and Stay Motivated” => “eB yppah dna yatS
        detavitoM”.*/
public class RepeatingLetters {
    public void reverse(String s) {
        System.out.println("before reverse : "+ s);
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String k = arr[i];
            int left = 0;
            int right = k.length() - 1;
            while (right >= left) {
                char ch = k.charAt(right);
                str.append(ch);
                right--;
            }
            str.append(" ");
        }
        System.out.println("After reverse :" + str);
    }
    public boolean repeatingLetter(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                System.out.println(s+ " : " + false);
                return false;
            }
            set.add(c);
        }
        System.out.println(s+ ": " + true);
        return true;
    }


    public static void main(String[] args) {
        RepeatingLetters obj = new RepeatingLetters();
        String s = "Be Happy and Stay Motivated";
        obj.reverse(s);
        obj.repeatingLetter("Happy");
        obj.repeatingLetter("Stay");

    }
}
