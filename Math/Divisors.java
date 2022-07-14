import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
       Scanner user_input = new Scanner(System.in);
       int num = user_input.nextInt();
       
       divisors(num);
       all_divisors(num);
    }
    static void divisors(int num){
        for(int i = 1; i<=num; i++){
            if(num%i==0) System.out.println(i);
        }
    }
    static void all_divisors(int num){
        int i;
        for(i=1; i*i <= num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
        for(;i>=1;i--){
            if(num%i==0){
                System.out.println(num/i);
            }
        }
    }
}
