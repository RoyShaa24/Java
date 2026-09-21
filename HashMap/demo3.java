package HashMap;

import java.util.HashMap;

public class demo3 {
    public static void main(String[] args) {
    //int arr[]={10,30,30,40,50,50};
    String s[]={"nsasn","nsasn","Melroy"};
    HashMap<String,Integer> map =new HashMap<>();
    for(int i=0;i<s.length;i++) {
        String n=s[i];
        //int n = arr[i];
        if (map.containsKey(n)) {
            map.put(n, map.get(n) + 1);

        } else {
            map.put(n, 1);
        }
    }
        System.out.println(map);

    for(String key: map.keySet())
    {
        if(map.get(key)>1)
        {
            System.out.println(key+":"+map.get(key));
        }
    }
}
}
