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

        
        int max =array[0];
        int ndmax = 0;

        for (i = 1; i < n; i++) {
           if (array[i]>max) {
                ndmax = max;
                max = array[i];         
            }else{
                if(array[i]>ndmax){
                    ndmax = array[i];
                }
            }
        }

        
        System.out.println("Maximum = "+max);
        System.out.println("2nd Maximum = "+ndmax);
    }
}