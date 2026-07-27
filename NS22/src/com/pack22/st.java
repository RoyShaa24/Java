package com.pack22;
import java.util.Scanner;

public class st {
    int age = 10;
    String name="sathwik";
        public static void main(String[] args) {
            st s1 = new st();
            System.out.println(s1.age);
            System.out.println((s1.name));
            st s2 = new st();
            s2.name="sham";
            s2.age=20;
            System.out.println(s2.name);
            System.out.println(s2.age);
            emp e1=new emp();
            System.out.println(e1.age);
            System.out.println(e1.name);
            e1.setSalary(1000.00);
            System.out.println(e1.getSalary());
            emp e5=new emp();
            e5.pin=105;
            e1.pin=101;
            System.out.println(e5.getSalary());
            System.out.println(e1.getSalary());
            e5.add(100,20000);
            

   } }
class emp {
    int age = 100;
    String name = "ravi";
    int pin=100;
    private double salary = 10000.00;

    public void setSalary(double salary) {
        System.out.println("setter");
        this.salary = salary;
    }

    public double getSalary() {
        System.out.println("getter");
        return this.pin;
    }

    void add(int pin, double salary) {
        if (this.pin == pin) {
            this.salary += salary;
            System.out.println(this.salary);
        } else {
            System.out.println("wrong pin");
        }
    }


    void sub(int pin, double salary) {
        if (this.pin == pin) {
            this.salary -= salary;
            System.out.println(this.salary);
        }
        else {
            System.out.println("does not match");
        }
    }
}