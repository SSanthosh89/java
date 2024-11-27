
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        

        while(input!=1){
            int sum = 0;
            while (input>0) {   
                int f = input % 10;
                input/=10;
                sum += f*f; 
                            
            }
            input = sum;  
            System.out.println(input);
            
        }
        if (input==1){
            System.out.println("happy");
        }else{
            System.out.println("unhappy");
        }
    }
}
