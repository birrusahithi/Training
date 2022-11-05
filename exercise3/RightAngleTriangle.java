package com.consultadd.exercise3;

import java.util.ArrayList;
import java.util.List;

public class RightAngleTriangle {
    public List<List<Integer>> rightAngle(int n){
        System.out.println(n);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            res.add(new ArrayList<Integer>());
            for (int j = 1; j <= i; j++) {
                res.get(i - 1).add(j);
            }
        }
        System.out.println(res);
       return res;
    }
    public static void main(String[] args){
        RightAngleTriangle obj = new RightAngleTriangle();
        obj.rightAngle(10);
    }
}
