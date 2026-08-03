package P3;
interface camera{
    void click_picture();
}
interface music{
    void click_play();
}
class laptop implements camera,music{
    @Override
    public void click_picture(){
        System.out.println("from camera interface");
    }
    @Override
    public void click_play(){
        System.out.println("from music interface");
    }
}
public class Pract2 {
    public static void main(String[] args) {
        laptop s=new laptop();
        s.click_picture();
        s.click_play();
    }
}
