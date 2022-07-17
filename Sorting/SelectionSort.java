package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 6, 7, 87, 34, 0, 56 };
        System.out.println(Arrays.toString(selection_sort(arr)));
    }

    static int[] selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
        return arr;
    }

}
