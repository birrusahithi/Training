package com.consultadd.exercise3;
/*10. WriteaJavaprogramtodisplayPascal'striangle.
        Test Data
        Input number of rows: 5 Expected Output :
        Input number of rows: 5 1
        11 121 1331
        14641*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> pascalTriangle(int n){
        List<List<Integer>> result = new ArrayList<>();
       List<Integer> list = new ArrayList<>();
       list.add(1);
       result.add(list);
        for(int i=1; i<n; i++){
            List<Integer> listing = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    listing.add(1);
                }else{
                    List<Integer> temp = result.get(i-1);
                    int number = temp.get(j-1)+temp.get(j);
                    listing.add(number);
                }
            }
            result.add(listing);
        }
        System.out.println(result);
        return  result;
    }
    public static void main(String[] args){
        PascalTriangle obj = new PascalTriangle();
        obj.pascalTriangle(6);
    }
}
