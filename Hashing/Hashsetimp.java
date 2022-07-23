package Hashing;

import java.util.*;
// hashset is used to store set of keys
// hashtable to store the keys
// hash function to store the keys
// add remove contains iterator size isempty clear 
// TC - O(1)

public class Hashsetimp {
    public static void main(String[] args) {

        HashSet<String> str = new HashSet<>();
        str.add("gfg");
        str.add("course");
        str.add("ide");
        System.out.println(str);
        System.out.println(str.contains("ide"));
        Iterator<String> i = str.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }
        System.out.println(str.size());
        str.remove("ide");
        System.out.println(str.isEmpty());
        str.clear();
        System.out.println(str.size());

        HashSet<Integer> num = new HashSet<>();
        for (int itrr = 0; itrr < 10; itrr++) {
            num.add(itrr);
        }
        Iterator<Integer> itr = num.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
    }
}
