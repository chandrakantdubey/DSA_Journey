package Hashing;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 10, 30 };
        int arr2[] = { 10, 30, 40, 50 };
        System.out.println(intersection(arr1, arr2));
    }

    static Integer intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int x : arr1) {
            s.add(x);
        }
        int res = 0;
        for (int x : arr2) {
            if (s.contains(x)) {
                res++;
                s.remove(x);
            }
        }
        return res;
    }
}
