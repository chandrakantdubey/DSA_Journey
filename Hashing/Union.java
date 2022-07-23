package Hashing;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {

        int[] arr1 = { 10, 20, 10, 30 };
        int arr2[] = { 10, 30, 40, 50 };
        System.out.println(union(arr1, arr2));
    }

    static HashSet<Integer> union(int[] arr1, int[] arr2) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int x : arr1) {
            s.add(x);
        }
        for (int x : arr2) {
            s.add(x);
        }
        return s;
    }
}
