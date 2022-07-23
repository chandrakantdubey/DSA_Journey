package Hashing;

import java.util.HashMap;

public class PairSum {
    public static void main(String[] args) {
        int target = 5;
        int[] arr = { -1, 1, 1, 1, 2, 3, 4, 6 };
        System.out.println(pairsumcount(arr, target));
    }

    static int pairsumcount(int[] arr, int target) {
        int count = 0;
        HashMap<Integer, Integer> pairarr = new HashMap<Integer, Integer>();
        for (int x = 0; x < arr.length; x++) {
            if (pairarr.containsKey(arr[x])) {
                pairarr.put(arr[x], pairarr.get(arr[x]) + 1);
            } else
                pairarr.put(arr[x], 1);

            if (pairarr.containsKey(target - arr[x])) {
                count = count + pairarr.get(target - arr[x]);
            }
        }
        return count;
    }
}
