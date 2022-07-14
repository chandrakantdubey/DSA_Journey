package Recursion;

public class Recur_3 {
    public static void main(String[] args) {
        fun(7);
    }

    static void fun(int n) {
        if (n == 0)
            return;
        fun(n / 2);
        System.out.print(n % 2);
    }
}

// generating the binary of a number.