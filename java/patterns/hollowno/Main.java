import java.util.Scanner;

public class Main {
    public static void printHollowPattern(int n) {
        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int num = 1; // Start numbering from 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print numbers at the boundary or leave spaces inside
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.printf("%02d ", num);
                } else {
                    System.out.print("   "); // Space for hollow part
                }
                num++;
            }
            System.out.println(); // New line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        printHollowPattern(n);
        scanner.close();
    }
}