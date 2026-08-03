package P3;
class Animal2{
    void eat(){
        System.out.println("Eatting");
    }
}
class Dog1 extends Animal2{
    void eat(){
        System.out.println("eatting");
    }
}
public class Pract7 {
    public static void main(String[] args) {
        Animal2 a=new Dog1();
        a.eat();
    }
}
