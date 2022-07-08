import java.util.Scanner;

// Manipultion of numbers for counting, reversing the digits and so on.

class count_of_digits {
    public static void main(String[] args) {

        // take the input of the digit from the user using the scanner object
        Scanner userInput = new Scanner(System.in);
        // created a new scanner object
        System.out.println("enter a number");
        // taking input from the user
        int digit = userInput.nextInt();
        // the input is of type of integer


        // approach 1 using recursive method.
        int digits_count = count_OfDigits(digit);
        System.out.println(digits_count);

        // approach 2 using iterative method
        int dgitsCount = countOfDigits(digit);
        System.out.println(dgitsCount);

        // approach 3 using logarithmic way
        int digits_Count = count_Of_Digits(digit);
        System.out.println(digits_Count);


        // reversing the digit in the number
        System.out.println(reverseDigit(digit));

    }
    
    // counting the number of digits.
    // iterative method
    public static int countOfDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    // recursive function to count the number of digits in a number
    static int count_OfDigits(int n){
        if(n==0) return 0;
        return 1 + count_OfDigits(n/10);
    }
    // logarithmic way
    static int count_Of_Digits(int n) {
        return (1+((int) Math.log10(n)));
    }

    // reversing the digits in the number using iterative method
    public static int reverseDigit(int n) {
        int rev_digit = 0;
        while (n != 0) {
            rev_digit = rev_digit*10 + (n % 10);
            n /= 10;
        }
        return rev_digit;
    }
    public static int revDigits(int n){
        int rev_Digits = 0;
        
        return rev_Digits;
    }
}
