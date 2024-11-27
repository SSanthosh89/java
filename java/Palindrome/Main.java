import java.util.Scanner;

public class Main {

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        number = Math.abs(number); // Convert negative numbers to positive
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int input = scanner.nextInt();

        // Output
        if (isPalindrome(input)) {
            System.out.println("The given number is Palindrome.");
        } else {
            System.out.println("The given number is not a Palindrome.");
        }

        scanner.close();
    }
}