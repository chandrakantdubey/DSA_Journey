package Strings;
import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int num = user_input.nextInt();
        Sieves(num);
    }

    static void Sieves(int num) {
        boolean[] arr = new boolean[num + 1];
        for (int i = 0; i < arr.length; i++)
            arr[i] = true;
        for (int i = 2; i * i <= num; i++) {
            if (arr[i] == true) {
                // System.out.println(i);
                for (int j = i * i; j <= num; j = j + i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            if (arr[i])
                System.out.println(i);
        }
    }
}
