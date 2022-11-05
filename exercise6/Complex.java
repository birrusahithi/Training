package com.consultadd.exercise6;
//1. Print the sum, difference, and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Complex {
    public String sum(ComplexNumber n1, ComplexNumber n2){
       int first = n1.getRealnumber() + n2.getRealnumber();
       int second = n1.getImaginaryNumber() + n2.getImaginaryNumber();
       String s = "" + first+"+"+ second+"i";
        System.out.println("Sum :"+ s);
        return s;
    }
    public String difference(ComplexNumber n1, ComplexNumber n2){
        int first = n1.getRealnumber()-n2.getRealnumber();
        int second = n1.getImaginaryNumber()-n2.getImaginaryNumber();
        String s = "" + first+"-"+ second+"i";
        System.out.println("Difference :" +s);
        return s;
    }
    public String product(ComplexNumber n1, ComplexNumber n2){
        int first = n1.getRealnumber()* n2.getRealnumber();
        int second = n1.getImaginaryNumber()* n2.getImaginaryNumber();
        String s = "" + first+"*"+ second+"i";
        System.out.println("Product :" +s);
        return s;
    }
    public static void main(String[] args) throws IOException {
        Complex obj = new Complex();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ComplexNumber n1 = new ComplexNumber();
        System.out.println("Please enter realNumber1: ");
        int real = Integer.parseInt(reader.readLine());
        n1.setRealnumber(real);
            System.out.println("PLease enter imaginary Number1: ");
            int imaginary = Integer.parseInt(reader.readLine());
            n1.setImaginaryNumber(imaginary);
        ComplexNumber n2 = new ComplexNumber();
        System.out.println("Please enter real number 2: ");
        int real2 = Integer.parseInt(reader.readLine());
        n2.setRealnumber(real2);
        System.out.println("Please enter imaginary number 2: ");
        int img2 = Integer.parseInt(reader.readLine());
        n2.setImaginaryNumber(img2);
        obj.sum(n1, n2);
        obj.difference(n1, n2);
        obj.product(n1, n2);
    }
}
