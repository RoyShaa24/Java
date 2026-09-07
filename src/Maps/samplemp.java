package Maps;

import java.util.ArrayList;

public class samplemp {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.stream().map(k->k=5).forEach(k-> System.out.println(k));
        System.out.println();
        list.stream().filter(k->k%2==0).forEach(k-> System.out.println(k));
        System.out.println();
        int res=list.stream().reduce(0,(a,b)->a+b);
        System.out.println(res);
    }
}
