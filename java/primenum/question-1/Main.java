//check whether prime or not

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input=scanner.nextInt();

        int i, flag=0;

        for (i=2; i<=input/2; i++){
            if (input%i==0){
                flag=1;
                break;
            }
        }
        
        if (flag==0 && input>1){
            System.out.println("prime");

        }else{
            System.out.println("not a prime");
        }

    }
}
