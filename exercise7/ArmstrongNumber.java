package com.consultadd.exercise7;
//6. Program to check the Armstrong number?
import java.util.Arrays;
import java.util.Map;

public class ArmstrongNumber {
    public boolean isArmstrong(int n){
        int number = n;
        int res=0;
        while(n!=0){
            int first = n%10;
            res += (int)Math.pow(first, 3);
            n = n/10;
        }
        if(res==number){
            System.out.println("True," + " " + number + " " + "is Armstrong");
            return true;
        }
        System.out.println("False," + " " + number + " " + "is not Armstrong");
        return false;
    }
    public static void main(String[] args){
        ArmstrongNumber obj= new ArmstrongNumber();
        int n = 153;
        obj.isArmstrong(n);
        int secon = 12;
        obj.isArmstrong(secon);
    }
}
