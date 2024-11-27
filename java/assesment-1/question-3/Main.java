 import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int input = scanner.nextInt();
        
        int[] array ={12,23,34,43,32,21,10,11};

        Arrays.sort(array);

        int output = array[array.length-input];

        System.out.println("the kth largest element is : "+output);
    }
}
