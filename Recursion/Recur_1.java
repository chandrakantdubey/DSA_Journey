package Recursion;

public class Recur_1 {
    public static void main(String[] args) {
        fun2(3);
    }

    static void fun2(int n) {
        if (n == 0)
            return;
        fun2(n - 1);
        System.out.println(n);
        fun2(n - 1);
    }
}
