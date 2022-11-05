package com.consultadd.exercise6;

public class Student {
    String name;
    public void name(String s){
        this.name = s;
        System.out.println("Name :" + name);
    }
    public void name(){
        name = "Unknown";
        System.out.println("Name : Unknown");
    }
    public static void main(String[] args){
        Student obj = new Student();
        obj.name("ConsultAdd");
        obj.name();

    }
}
