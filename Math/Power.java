package Math;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int num = user_input.nextInt();
        int pow = user_input.nextInt();
        System.out.println(power(num, pow));
    }

    static int power(int num, int pow) {
        int res = 1;
        while (pow > 0) {
            if (pow % 2 == 0)
                res = res * num;
            res = num * num;
            pow /= 2;
        }
        return res;
    }
}
