package Math;

import java.util.Scanner;

public class Trailing_Zeros {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int N = user_input.nextInt();
        System.out.println(cntTraZeros(N));
    }

    static int cntTraZeros(int N) {
        int res = 0;
        for (int i = 5; i <= N; i = i * 5) {
            res = res + N / i;
        }
        return res;

    }
}
