package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 6, 7, 87, 34, 0, 56 };
        System.out.println(Arrays.toString(insertion_sort(arr)));
    }

    static int[] insertion_sort(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
