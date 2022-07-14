import java.util.Scanner;

public class Exactly3D {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int num = user_input.nextInt();
        System.out.println(exactly3Divisors(num));
    }

    static int exactly3Divisors(int N)
    {
       //Your code here
       
       int count=0;
       for(int i=2; i<=Math.sqrt(N);i++)
       {
           if(isPrime(i)&&(i*i<=N)){
               count++;
               // System.out.println(i*i+" is has 3 factors & Count is :"+count);
           }
       }
       
       return count;
   }
    
   // static boolean isPrime(int N){
   // if(N==1) return false;
   // if(N==2 || N==3) return true;
   // if(N%2==0 || N%3==0) return false;
   // for(int i = 5; i*i < N; i+=6){
   // if(N%i==0 || N%(i+2)==0) return false;
   // }
   // return true;
   // }

   public static boolean isPrime(int N) {
       if (N == 1)
           return false;
       if (N == 2 || N == 3)
           return true;
       for (int i = 2; i <= Math.sqrt(N); i++)
           if (N % i == 0)
               return false;
        return true;
    }
}
