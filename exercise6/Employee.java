package com.consultadd.exercise6;
//2. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
/*Name        Year of Joining       Address
Robert       1994              64C-Walls Street
Sam          2000              68D-Walls Street
John         1999              26B-Walls Street*/
public class Employee {
    String name;
    int year;
    String Address;
    Employee(String name, int year, String Address){
        this.name = name;
        this.year = year;
        this.Address = Address;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return Address;
    }
    public static void main(String[] args){
        Employee emp1 = new Employee("Robert", 1994, "64C- Walls Streat");
        Employee emp2 = new Employee("Sam", 2000, "68D-Walls Street");
        Employee emp3 = new Employee("John", 1999, "26B-Walls Street");
        System.out.print("Name      " + "Year of Joining   " + "Address");
        System.out.println();
        System.out.println(emp1.getName() + "    "+ emp1.getYear() +"              " + emp1.getAddress());
        System.out.println(emp2.getName()+ "       " + emp2.getYear() + "              " + emp2.getAddress());
        System.out.println(emp3.getName()+ "      " + emp3.getYear() + "              " + emp3.getAddress());
    }
}
