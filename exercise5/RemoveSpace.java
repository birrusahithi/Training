package com.consultadd.exercise5;
//3. Write a JAVA method to remove all the spaces from the String and return the resultant.
public class RemoveSpace {
    public  String removeSpace(String s){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!Character.isWhitespace(c)){
                result.append(c);
            }
        }
        System.out.println(result);
        return result.toString();
    }
    public static void main(String[] args){
        RemoveSpace obj = new RemoveSpace();
        String s = "Write a JAVA method to remove all the spaces from the String and return the resultant.";
        obj.removeSpace(s);
    }
}
