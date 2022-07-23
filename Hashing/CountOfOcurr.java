package Hashing;

import java.util.HashMap;

public class CountOfOcurr {
    public static void main(String[] args) {
        int[] arr = { 34, 45, 56, 76, 76, 45, 89, 89, 89, 98, 12, 34, 56 };
        System.out.println(countOfOcurr(arr, 56));
        System.out.println(countOfFreq(arr, 56));
    }

    static int countOfOcurr(int arr[], int key) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int x : arr) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        return count.get(key);
    }

    static int countOfFreq(int[] arr, int target) {
        HashMap<Integer, Integer> frearr = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (frearr.containsKey(i)) {
                frearr.put(arr[i], frearr.get(arr[i]) + 1);
            } else
                frearr.put(arr[i], 1);
        }
        return frearr.get(target);
    }

}
