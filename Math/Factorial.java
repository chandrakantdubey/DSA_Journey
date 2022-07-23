package Math;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int N = user_input.nextInt();
        System.out.println(factorial(N));
        
    }
    static BigInteger factorial(int N){
        BigInteger f = new BigInteger("1");
        for(int  i = 2; i <= N; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
