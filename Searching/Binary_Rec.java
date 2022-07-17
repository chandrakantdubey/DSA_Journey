package Searching;

public class Binary_Rec {
    public static void main(String[] args) {
        int[] in_arr = { 2, 4, 78, 89, 188, 765, 5677 };
        int first = 0;
        int last = in_arr.length - 1;
        int index = BinarySort(in_arr, 4, first, last);
        System.out.println(index);

    }

    static int BinarySort(int[] arr, int x, int first, int last) {
        if (first > last)
            return -1;
        int mid = (first + last) / 2;
        if (x == arr[mid])
            return mid;
        else if (x > arr[mid])
            return BinarySort(arr, x, mid + 1, last);
        else
            return BinarySort(arr, x, first, mid - 1);
    }

}
