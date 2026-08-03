package P3;
abstract class Animal{
    abstract void eat();
    abstract void run();
}
class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("cat-eat");
    }

    @Override
    void run() {
        System.out.println("cat-run");
    }
}
public class Pract3 {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat();
        c.run();
    }
}
