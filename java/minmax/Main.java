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

        int min=array[0] ;
        int max =0;
  

        for (i = 0; i < n; i++) {
            if (array[i]> max) {
                
                max = array[i];         
            }if(array[i]<min){
                min = array[i];
            }
        }

        System.out.println("Minimum = "+min);
        System.out.println("Maximum = "+max);
        
    }
}