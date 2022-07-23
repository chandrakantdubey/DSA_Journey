package Math;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner user_input = new Scanner (System.in);
        int num1 = user_input.nextInt();
        int num2 = user_input.nextInt();
        System.out.println(GCD_Naive(num1,num2));
        System.out.println(GCD_Eucladien(num1, num2));
    }

    static int GCD_Naive(int num1, int num2){

        int temp = Math.min(num1,num2);
        while(temp>=1){
            if(num1%temp==0 && num2%temp==0){
                return temp;
            }
            temp--;
        }
        return temp;
    }

    static int GCD_Eucladien(int num1, int num2){
        if(num2==0) return num1;
        return GCD_Eucladien(num2, num1%num2);
    }
}
