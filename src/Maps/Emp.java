package Maps;

import java.util.ArrayList;

public class Emp {
    public static void main(String[] args) {
        employee e1=new employee(1,50000,"sumanth","cs");
        employee e2=new employee(2,58000,"sam","computers");
        employee e3=new employee(3,50000,"vivek","com");
        employee e4=new employee(4,50000,"sam","business");
        ArrayList<employee> t=new ArrayList<>();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);

        for(employee e:t)
        {
            System.out.println(e.getId()+" "+e.getSalary()+" "+e.getDept()+" "+e.getName()+" ");
        }
    }
}
