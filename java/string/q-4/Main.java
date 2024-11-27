
import java.util.Scanner;



public class Main {
    public static String findPalindrome(String input) {
        // Array to count frequency of each character
        int[] charCount = new int[26];
        for (char c : input.toCharArray()) {
            charCount[c - 'a']++;
        }

        // StringBuilder to construct the two halves of the palindrome
        StringBuilder half = new StringBuilder();
        char oddChar = 0;
        int oddCount = 0;

        // Process the frequency array
        for (int i = 0; i < 26; i++) {
            if (charCount[i] % 2 != 0) {
                oddCount++;
                oddChar = (char) (i + 'a');
                if (oddCount > 1) {
                    return "Palindrome not possible";
                }
            }

            // Add half of the characters to the half string
            for (int j = 0; j < charCount[i] / 2; j++) {
                half.append((char) (i + 'a'));
            }
        }

        // Build the palindrome
        String firstHalf = half.toString();
        String secondHalf = half.reverse().toString();
        return (oddCount == 1) ? firstHalf + oddChar + secondHalf : firstHalf + secondHalf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String result = findPalindrome(input);
        System.out.println("Output: " + result);
    }
}
