package com.consultadd.exercise5;
//Write a JAVA program that takes a given String of words and returns the length of the shortest word.
public class LengthOfShortWord {
    public int lengthOfWord(String word){
        int result = Integer.MAX_VALUE;
        String[] arr = word.split(" ");
        for(int i=0; i<arr.length; i++){
            int length = arr[i].length();
            if(length<result){
                result = length;
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args){
        LengthOfShortWord obj = new LengthOfShortWord();
        String words = "Write JAVA program that takes given String of words and returns the length of the shortest word";
        obj.lengthOfWord(words);
    }
}
