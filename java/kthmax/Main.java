import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int n = sc.nextInt(); 
        int[] array = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt(); 
        }

        System.out.println("Enter the k value:");
        int k = sc.nextInt(); 

        
        if (k > n || k <= 0) {
            System.out.println("Invalid k value. Must be between 1 and " + n);
            return;
        }

        int max = Integer.MIN_VALUE;
        int[] array2 = new int[n]; 

        for (int j = 0; j < k; j++) { 
            max = Integer.MIN_VALUE; 

            for (int i = 0; i < n; i++) {
                if (array2[i] == 0 && array[i] > max) { 
                    max = array[i]; 
                }
            }

            
            for (int i = 0; i < n; i++) {
                if (array[i] == max) {
                    array2[i] = 1; 
                    break; 
                }
            }
        }

        System.out.println("kth max = " + max); 
    }
}
