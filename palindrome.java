import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();
        System.out.println(isPalindrome(num));
        
    }
   
// iterative function
public static boolean isPalindrome(int n){
    int num = n;
    int rev_digit = 0;
    while (n != 0) {
        rev_digit = rev_digit * 10 + (n % 10);
        n /= 10;
    }
    if(num==rev_digit){
        return true;
    }
    return false;
}

}

// to find the palindrome we will reverse the digits by taking modulus and compare if it is palindrome or not.

