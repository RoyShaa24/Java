package P3;
class Animal1{
        int age;
        String name ;
        void display(){
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
    }
}
class Dog extends Animal1{
    String breed;
    void display_Dog(){
        System.out.println("Breed:"+breed);}
}
class Cat1 extends Animal1{
    String color;
    void display_Cat(){
        System.out.println("Color:"+color);

}}
class Bird extends Animal1 {
    int wingspan;

    void display_Bird() {
        System.out.println("wingspan:" + wingspan);
    }
}
public class Pract6 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="Lion";
        d.age=2;
        d.breed="Lab";
        d.display();
        d.display_Dog();
        Cat1 c=new Cat1();
        c.name="Tommy";
        c.age=3;
        c.color="white";
        c.display();
        c.display_Cat();
        Bird b=new Bird();
        b.name="Kingfisher";
        b.age=18;
        b.wingspan=20;
        b.display();
        b.display_Bird();


    }
}
