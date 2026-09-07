package Maps;

import java.util.HashMap;
import java.util.SplittableRandom;

public class Sample {
    public static void main(String[] args) {
        String s="Nsam";
        HashMap<Character,Integer> map1=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (map1.containsKey(ch)){
                map1.put(ch, map1.get(ch)+1);
            }else {
                map1.put(ch,1);
            }
        }
        for(char key: map1.keySet()){
            System.out.println(key+" "+ map1.get(key));
        }
        for(char key: map1.keySet()){
                if(map1.get(key)>10) {
                    System.out.println(key + " " + map1.get(key));
                }
            }

        String res="";
        for (int i=0;i<s.length();i++){
            res=s.charAt(i)+res;//Reversing the string
        }
        System.out.println(res);
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(10,1);
        map.put(20,1);
        map.put(10,1);//Duplicate pair will not be added
        map.put(10,2);//updating
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey(10));
    }
}
