package P3;
interface Nsam{
    void cse_dept();
    void com_dept();
}

class student implements Nsam{
    @Override
    public void cse_dept(){
        System.out.println("Student from cse department");
    }
    @Override
    public void com_dept(){
        System.out.println("Student from com department");
    }
}
public class Pract1 {
    public static void main(String[] args) {
     student s=new student();
     s.com_dept();
     s.cse_dept();
    }
}
