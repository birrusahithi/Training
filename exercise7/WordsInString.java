package com.consultadd.exercise7;
//5. Program to Count the number of words in the String?
public class WordsInString {
    public int countWords(String l){
        //using split method
        String[] array = l.split(" ");
        System.out.println(array.length);
        return array.length;
    }
    public static void main(String[] args){
        WordsInString obj = new WordsInString();
        String s = "Program to count the number of words in the String";
        obj.countWords(s);

    }
}
