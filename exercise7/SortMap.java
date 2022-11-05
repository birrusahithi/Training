package com.consultadd.exercise7;
//11. Find to sort HashMap in java by keys and values?

import javax.swing.*;
import java.util.*;

public class SortMap {
    //sort using keys
    public Map<Integer, Integer> sortKeys(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> one, Map.Entry<Integer, Integer> two) {
                return (one.getKey()).compareTo(two.getKey());
            }
        });
        Map<Integer, Integer> result = new LinkedHashMap<Integer, Integer>();
        for(Map.Entry<Integer, Integer> temp : list ){
            result.put(temp.getKey(), temp.getValue());
        }
        return result;
    }

    //sort using values
    public Map<Integer, Integer> sortValues(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
            public  int compare(Map.Entry<Integer, Integer> one, Map.Entry<Integer, Integer> two){
                {
                    return one.getValue().compareTo(two.getValue());
                }
                }

        });
        Map<Integer, Integer> result = new LinkedHashMap<>();
        for(Map.Entry<Integer, Integer> me : list){
            result.put(me.getKey(), me.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 4);
        map.put(90, 21);
        map.put(32, 4);
        map.put(1, 3);
        map.put(12, 10);
        map.put(22, 90);
        SortMap obj = new SortMap();
        System.out.println("Before : ");
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            System.out.println("Key :"+ " " +m.getKey() + " " + "Value :" + " " + m.getValue());
        }
       Map<Integer, Integer> result =  obj.sortKeys(map);
        System.out.println("After sorting by keys");
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + ", Value : "
                    + entry.getValue());
        }
        System.out.println("After sorting by values");
        Map<Integer, Integer> valuesresult = obj.sortValues(map);
        for (Map.Entry<Integer, Integer> entry : valuesresult.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + ", Value : "
                    + entry.getValue());
        }
    }
    }
