package Math;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner user_input = new Scanner (System.in);
        int num1 = user_input.nextInt();
        int num2 = user_input.nextInt();
        System.out.println(LCM1(num1,num2));
        System.out.println((num1*num2)/GCD_Eucladien(num1, num2));
    }
    static int LCM1(int num1, int num2){
        int res = Math.max(num1,num2);
        while(true){
            if(res%num1==0 && res%num2==0){
                return res;
            }
            res++;
        }
    }

    // using the fact that the product of two numbers is equal to the product of the LCM and GCD
    static int GCD_Eucladien(int num1, int num2){
        if(num2==0) return num1;
        return GCD_Eucladien(num2, num1%num2);
    }
}
