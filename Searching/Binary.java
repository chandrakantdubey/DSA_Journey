package Searching;

public class Binary {
    public static void main(String[] args) {

        int x = 10;
        int[] in_arr = { 3, 5, 6, 8, 9, 10, 450, 670, 1234, 5678 };

        int first = 0;
        int last = in_arr.length - 1;
        int mid = (first + last) / 2;

        for (int i = 0; i < in_arr.length; i++) {
            mid = (first + last) / 2;
            if (x == in_arr[mid]) {
                break;
            } else if (x < in_arr[mid]) {
                last = mid - 1;
            } else if (x > in_arr[mid]) {
                first = mid + 1;
            }
            mid = -1;
        }
        System.out.println(mid);
    }

}
