package com.consultadd.exercise7;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Perumtations {
    List<String> res = new ArrayList<>();

        // Function to print all the permutations of str
       public void printPermutn(String str)
        {
            print(str, "");

        }
        public void print(String st1, String st2){
           if(st1.length()==0){
               res.add(st2);
               return;
           }
           for(int i=0; i<st1.length(); i++){
               String front = st1.substring(0, i);
               String back = st1.substring(i+1);
               String newst1 =front + back;
               print(newst1, st2+st1.charAt(i));
           }
        }

        // Driver code
        public static void main(String[] args)
        {
            Perumtations obj = new Perumtations();
            String s = "Train";
            obj.printPermutn(s);
            System.out.println(obj.res);
        }
    }

