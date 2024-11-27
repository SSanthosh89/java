
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of array :");
        int n = sc.nextInt();
        int[] array = new int [n];
        int i;
        for(i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Array = "+Arrays.toString(array));
        int sum = 0;

        for(int num:array){
            if (num % 10 == 8){
                sum += num;
            }
        }
        System.out.println("sum of digits ends with 8 = "+sum);
    }
}