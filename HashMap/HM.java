package HashMap;

import java.util.HashMap;
public class HM {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map =new HashMap();

        map.put(10,1);
        map.put(10,5);
        map.put(20,4);
        map.put(50,6);
        map.put(30,1);
        map.put(40,4);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println((map.values()));
        System.out.println(map.containsKey(10));
        System.out.println(map.isEmpty());
        System.out.println((map.getOrDefault(10,0)));
    }
}
