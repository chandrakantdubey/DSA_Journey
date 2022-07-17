package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2 };
        int n = arr.length;

        quick_sort(arr, 0, n - 1);
        System.out.println(Arrays.toString(quick_sort(arr, 0, n - 1)));
    }

    // pivot can be first, last, median or random element
    // implementing using the last element as the pivit element.
    static int[] quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            quick_sort(arr, low, pidx - 1);
            quick_sort(arr, pidx + 1, high);
        }
        return arr;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

}