package Hashing;

import java.util.*;

// used to store key value pairs.(specified in pair)
// implements map interface(key value pair)
// set interface(key)
// put getKey getValue size containskey containsValue remove 

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        hashmap.put("gfg", 10);
        hashmap.put("ide", 15);
        hashmap.put("course", 20);
        hashmap.put("sucks", 25);
        System.out.println(hashmap);
        System.out.println(hashmap.size());
        for (Map.Entry<String, Integer> r : hashmap.entrySet()) {
            System.out.println(r.getKey() + " " + r.getValue());
        }
    }
}
