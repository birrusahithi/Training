package com.consultadd.exercise2;
//3. Write a program in JAVA to implement the given flowchart
public class FlowChartImplementation {
    public void flowChart(int a, int b, int c){
        int average = (a+b+c)/3;
        System.out.println("average = "+ average);
        if(average>a && average>b && average>c){
            System.out.println("Average is higher than a, b, c");
        }else if(average> a && average>b){
            System.out.println("Average is higher than a, b");
        }else if(average>a && average>c){
            System.out.println("avg is higher than a, c");
        }else if(average>b && average>c){
            System.out.println("avg is higher b, c");
        }else if(average>a){
            System.out.println("Avg is just higher than a");
        }else if(average>b){
            System.out.println("Avg is just higher than b");
        }else if(average>c){
            System.out.println("Avg is just higher than c");
        }
    }
    public static void main(String[] args){
        FlowChartImplementation obj = new FlowChartImplementation();
        int a = 10;
        int b=20;
        int c = 30;
        obj.flowChart(a, b, c);
    }
}
