package excep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

public class demo3 {
    public static void main(String[] args) {
        employe e1=new employe(18,211,"ram");
        employe e2=new employe(20,047,"Gian");

        ArrayList<employe>list1=new ArrayList<>();
        list1.add(e1);
        list1.add(e2);
        list1.add(new employe(10, 420, "Sita"));

          for(employe e:list1)
          {
              System.out.println(e.getId()+" "+e.getName()+" "+e.getAge());
          }
          ArrayList<product> list2=new ArrayList<>();
          product p2=new product(1,"JK",2000);
          list2.add(new product(301,"dk",3000));
          list2.add(p2);
          list2.add(new product(350,"Udaya",1500));

                  for(product p:list2)
                  {
                      System.out.println(p.getId()+" "+p.getPrice()+" "+p.getName());
                  }

                  ArrayList<Object> list3=new ArrayList<>();
                  list3.add(e1);
                  list3.add(p2);
                  for(Object o:list3)
                  {
                      System.out.println(o);
                  }

                  ArrayList<String> list4=new ArrayList<>();
                  list4.add("Apple");
                  list4.add("Orange");
                  list4.add("Strawberry");
                  System.out.println(list4);

        System.out.println("using for loop");
        for(int i=0;i<list4.size();i++)
        {
            System.out.println(list4.get(i));
        }

        System.out.println("using for each");
        for(String a:list4)
            System.out.println(a);
        System.out.println("using iterator");
        Iterator<String> x=list4.iterator();
        while(x.hasNext())
        {
            System.out.println(x.next());
        }
        //list iterator Interface
        System.out.println("Using List Iterator");
        ListIterator<String> x1=list4.listIterator();
        while(x1.hasNext())
        {
            System.out.println();
        }
    }



}
