package Linkedlist;

interface Nsam{
    void cal(int a,int b);
}
public class interfacesam {
    public static void main(String[] args) {
        Nsam n=(int a,int b)-> {
            System.out.println("Sum:" + (a + b));
        };
          n.cal(10,20);
          Nsam n1=(int a,int b)->{
              System.out.println("Diff:"+(a-b));
        };
          n1.cal(10,20);

          Nsam n2=(int a,int b)->{
              System.out.println("Product:"+(a*b));
          };
          n2.cal(10,20);
          }
    }

