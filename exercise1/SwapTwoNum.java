package com.consultadd.exercise1;

//1. Swap two numbers using the third variable as the result name and do the same task without using any third variable.
public class SwapTwoNum {
    public void swapWithVariable(int first, int second) {
        System.out.println("USing variable beforeSwap first: " + first);
        System.out.println("Using Variable beforeSwap  second:" + second);
        int third = first;
        first = second;
        second = third;
        System.out.println("Using Variable AfterSwap first:" + first);
        System.out.println("Using Variable AfterSwap second :" + second);
    }

    public void swaptWithoutVariable(int first, int second) {
        System.out.println("Without USing variable beforeSwap first: " + first);
        System.out.println("Without Using Variable beforeSwap  second:" + second);
        first = first *second;
        second = first/second;
        first = first/second;
        System.out.println("Without Using Variable AfterSwap first:" + first);
        System.out.println("Without Using Variable AfterSwap second :" + second);
    }

    public static void main(String[] args) {
        SwapTwoNum obj = new SwapTwoNum();
        int first = 2;
        int second = 4;
        obj.swapWithVariable(first, second);
        obj.swaptWithoutVariable(first, second);

    }
}
