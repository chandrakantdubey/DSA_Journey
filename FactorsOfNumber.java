import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner user_input = new Scanner (System.in);
        int num = user_input.nextInt();

        // iterative solution by actually going through all the number to see.
        for(int itr = 1; itr <= num; itr++){
            if(num%itr==0){
            System.out.println(itr);
            // System.out.println(num / itr); 
            //this will work out if we find a way to stop printing numbers smaller than num/2 and product equal to num.
            }
        }
    }

}

// factors of a number are the number that divide the number completely  
