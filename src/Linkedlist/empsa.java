package Linkedlist;

import Maps.employee;

import java.util.ArrayList;

public class empsa {
    public static void main(String[] args) {


        ArrayList<Emp> emp1 = new ArrayList<>();
        Emp e1 = new Emp(200, "Siya", 20000, "IT");
        Emp e2 = new Emp(300, "Tiya", 15000, "CS");
        Emp e3 = new Emp(400, "Riya", 30000, "IT");

        emp1.add(e1);
        emp1.add(e2);
        emp1.add(e3);

        for(Emp e:emp1)
        {
            System.out.println(e.getId()+" "+e.getSalary()+" "+e.getDept()+" "+e.getName()+" ");
        }

        emp1.stream().filter( k->k.getSalary()<80000).forEach(Emp);

    }
}
