package Hashing;

import java.util.HashSet;

public class CountDistinct {
    public static void main(String[] args) {
        int[] arr = { 10, 25, 10, 56, 78, 980, 9, 101, 56 };
        int arr1[] = new int[4];
        arr1[0] = 4;
        arr1[1] = 6;
        System.out.println();
        System.out.println(countDistinct(arr));
        // System.out.println(countdistinct(arr1));
    }

    static int countDistinct(int arr[]) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        return s.size();
    }
}
