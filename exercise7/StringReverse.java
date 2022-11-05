package com.consultadd.exercise7;
//1. Program to reverse a string in java
public class StringReverse {
    public String reverseString(String k){
        //using StringBuilder
        StringBuilder str = new StringBuilder();
        for(int i=k.length()-1; i>=0; i--){
            char c = k.charAt(i);
            str.append(c);
        }
        System.out.println(str);
        return str.toString();
    }
    public String reverse(String k) {
        //using string
        String result = "";
        for (int i = k.length() - 1; i >= 0; i--) {
            char c = k.charAt(i);
            result +=c;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args){
        StringReverse obj = new StringReverse();
        String k = "ConsultAdd";
        obj.reverseString(k);
        obj.reverse(k);

    }
}
