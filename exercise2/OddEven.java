package com.consultadd.exercise2;
//6. Given an integer, perform the following conditional actions
//a. if is odd, print NEW
//b. If is even and in the inclusive range of 2 to 5, print old
//c. If is even, and in the inclusive range of 6 to 30, print NEW
//d. If is even and greater that 30, print OLD
public class OddEven {
    public String oddEven(int number){
        String k = "";
        if(number%2==1){
            k = "NEW";
        }else if(number%2==0 && (number>2 && number<5 ) || number >30){
            k = "OLD";
        }else if(number%2==0 && (number >6 && number<30 )){
            k = "NEW";
        }
        return  k;
    }
    public static void main(String[] args){
        OddEven obj = new OddEven();

    }

}
