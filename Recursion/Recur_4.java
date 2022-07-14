package Recursion;

public class Recur_4 {
    public static void main(String[] args) {
        // print 1 to N:Non-Tail Recursive
        fun1toN(10);
        System.out.println();
        // print N to 1: Non-tail
        funNto1(10);
    }

    static void fun1toN(int n) {
        if (n == 0)
            return;
        fun1toN(n - 1);
        System.out.print(n + " ");
    }

    static void funNto1(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        fun1toN(n - 1);
    }
}
