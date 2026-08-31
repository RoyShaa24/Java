package Collection;

import sample2.employee;
import sample2.product;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        product p1=new product(5000,101,"aaa");
        product p2=new product(10000,102,"xyz");
        employee e1=new employee(35,1,"ram");
        employee e2=new employee(40,2,"riya");

        ArrayList<employee>list=new ArrayList<>();
        list.add(e1);
        list.add(e2);

        ArrayList<product>lp=new ArrayList<>();
        lp.add(p1);
        lp.add(p2);

        for(employee e:list)
        {
            System.out.println(e.getId()+" "+e.getName()+" "+e.getAge());
        }

        for(product p:lp)
        {
            System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
        }
    }
}
