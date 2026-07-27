package com.pack22;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1. create the object of the scanner class

        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=s.next();
        System.out.println("Enter your Age:");
        int age= s.nextInt();
        System.out.println("Enter CGPA:");
        float cgpa=s.nextFloat();
        System.out.println("Enter PHone no:");
        long phno=s.nextLong();
        System.out.println("Is student graduated?");
        boolean isgraduate=s.nextBoolean();

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("CGPA:"+cgpa);
        System.out.println("Phone Number:"+phno);
        System.out.println("Is graduated?:"+isgraduate);



    }
}
