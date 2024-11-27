import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int flag = 1;

        while (input > 9) { 
            int lastTwo = input % 100;
            int ld = lastTwo % 10; 
            int sl = lastTwo / 10; 
            int diff = Math.abs(ld - sl);

            if (diff != 1) { 
                flag = 0;
                break;
            }

            input /= 10; 
        }

        if (flag == 1) {
            System.out.println("jumping num");
        } else {
            System.out.println("no jumping num");
        }
    }
}
