package com.consultadd.exercise6;
/*4. Create a class named 'Rectangle' with two data members- length and breadth and a method to calculate the area which is 'length*breadth'. The class has three constructors which are :
        1 - having no parameter - values of both length and breadth are assigned zero.
        9
        1. Print the sum, difference, and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.
        2. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:

        10
        2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
        3 - having one number as a parameter - both length and breadth are assigned that number.
        Now, create objects of the 'Rectangle' class having none, one, and two parameters and print their areas.*/
public class Rectangle {
    int length;
    int breadth;
    Rectangle(){
        this.length =0;
        this.breadth = 0;
    }
    Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;

    }
    Rectangle(int number){
        this.length = number;
        this.breadth = number;
    }
    public int area(){
        int area = length*breadth;
        return area;
    }
    public static void main(String[] args){
        Rectangle obj = new Rectangle();
        Rectangle obj1 = new Rectangle(2,5);
        Rectangle obj2 = new Rectangle(3);
        System.out.println("For None area : " + obj.area());
        System.out.println("For Two area : "+ obj1.area());
        System.out.println("For One area : "+ obj2.area());

    }
}
