package com.pack22;

public class Test2 {
    int a=10;   //intannce variable
    static int b=20; //static

    void display(){
        int c=3; //static
        System.out.printf("variable :"+c);
    }
    public static void main(String[] args) {
        //Test2 t= new Test2()
        // System.out.print(t.a) ; Accessing instance variable
        //t.display();
        // System.out.print(b) ; Accessing instance variable
        //t.display();
        Test2 t= new Test2();
        t.display();
    }
}
