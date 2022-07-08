import java.util.Scanner;

public class Prime_Factor {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int num = user_input.nextInt();
        // print_Primes(num);
        print_Prime(num);
    }
    static void print_Primes(int N){
        if(N==1) return;
        for(int i = 2; i <N; i++){
            if(isPrime(i)){
                int x = i;
                while(N%x==0){
                    System.out.println(i);
                    x = x*i;
                }
            }
        }
    }
    static void print_Prime(int N){
        if(N==1) return;
        if(N==2 || N==3) System.out.println(N);
        for(int i = 2; i*i <= N; i++){
            if(isPrime(i)){
                while(N%i==0){
                    System.out.println(i);
                    N=N/i;
                }
            }
        }
        if(N>1) System.out.println(N);

    }
    static boolean isPrime(int N){
        if(N==1) return false;
        if(N==2 || N==3) return true;
        if(N%2==0 || N%3==0) return false; 
        for(int i = 5; i*i <= N; i+=6){
            if(N%i==0 || N%(i+2)==0) return false;
        }
        return true;
    }
}
