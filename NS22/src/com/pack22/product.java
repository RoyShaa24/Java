package com.pack22;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {

        //1. create the object of the scanner class

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Product name:");
        String name = s.next();
        System.out.println("Enter ID:");
        int id = s.nextInt();
        System.out.println("Enter Manufactured month:");
        String manufactured = s.next();
        System.out.println("Enter Price of the product:");
        int price = s.nextInt();
        System.out.println("Is Product Expired?");
        boolean isgraduate = s.nextBoolean();

        System.out.println("Name:" + name);
        System.out.println("Age:" + id);
        System.out.println("CGPA:" + manufactured);
        System.out.println("Price:" + price);
        System.out.println("Is graduated?:" + isgraduate);
    }
}