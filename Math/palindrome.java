package Math;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();
        System.out.println(isPalindrome(num));
        // int temp = Palindrome(num, 0);
        System.out.println(Palindrome(num, 0) == num);
    }

    // iterative function
    public static boolean isPalindrome(int n) {
        int num = n;
        int rev_digit = 0;
        while (n != 0) {
            rev_digit = rev_digit * 10 + (n % 10);
            n /= 10;
        }
        if (num == rev_digit) {
            return true;
        }
        return false;
    }

    public static int Palindrome(int num, int temp) {
        if (num == 0)
            return temp;
        temp = temp * 10 + num % 10;
        return Palindrome(num / 10, temp);
    }

}

// to find the palindrome we will reverse the digits by taking modulus and
// compare if it is palindrome or not.
