package Math;
import java.lang.Thread.State;
import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner user_input = new Scanner (System.in);
        int num = user_input.nextInt();

        // Naive approach to check if a number is prime
        System.out.println(isPrime(num));
        // improved better approach
        System.out.println(isPrime1(num));
        // optimised approach
        System.out.println(isPrime2(num));
    }

    static boolean isPrime(int N){
        if(N==1) return false;
        if(N==2 || N==3) return true;
        for(int i = 2; i<N;i++){
            if(N%i==0) return false;
        }
        return true;
    }
    static boolean isPrime1(int N){
        if(N==1) return false;
        for(int i = 2; i*i <= N ; i++){
            if(N%i==0) return false;
        }
        return true;
    }
    static boolean isPrime2(int N){
        if(N==1) return false;
        if(N==2 || N==3) return true;
        if(N%2==0 || N%3==0) return false; 
        for(int i = 5; i*i <= N; i+=6){
            if(N%i==0 || N%(i+2)==0) return false;
        }
        return true;
    }
}
