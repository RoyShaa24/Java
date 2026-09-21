package Demo;

import java.util.HashMap;

public class Sample1 {
    public static void main(String[] args) {

        String a[] = {"Riya", "Riya", "Divya", "Seema"};

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            String name = a[i];

            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        for (String name : map.keySet()) {
            if (map.get(name) > 1) {
                System.out.println(name);
            }
        }
    }
}