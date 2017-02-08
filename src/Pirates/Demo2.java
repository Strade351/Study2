package Pirates;

import java.util.*;

/**
 * Created by ABondarev on 08.02.2017.
 */
public class Demo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm;
        hm = new HashMap<>();
        hm.put("John", 200);
        hm.put("Jack", 100);
        hm.put("BlackBeard", 250);
        hm.put("Cook", 50);
        hm.put("Hook", 5);

        HashMap<Integer, String> hm2;
        hm2 = new HashMap<>();
        hm2.put(200, "John");
        hm2.put(100, "Jack");
        hm2.put(250, "BlackBeard");
        hm2.put(50, "Cook");
        hm2.put(5, "Hook");

        List<Integer> sortedKeys = new ArrayList<>(hm2.keySet());
        Collections.sort(sortedKeys);
        for (Integer x: sortedKeys){
            System.out.println(hm2.get(x) + x);
        }
        TreeMap<String, Integer> tm = new TreeMap<>(hm);

    }
}
