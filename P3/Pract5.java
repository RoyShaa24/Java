package P3;
interface cse_dept{
    void dept_details();
}
interface com_dept{
    void dept_Details();

}
class Nsam1 implements cse_dept,com_dept{
    @Override
    public void dept_Details() {
        System.out.println("from com interface-com_department");
    }

    @Override
    public void dept_details() {
        System.out.println("from cse interface-cse_department");
    }
}
public class Pract5 {
    public static void main(String[] args) {
        Nsam1 n=new Nsam1();
        n.dept_Details();
        n.dept_details();
    }
}
