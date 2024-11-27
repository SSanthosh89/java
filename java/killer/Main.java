import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int pow = 1;
        
        while(pow<=input){
            pow *= 2;
            System.out.println(pow);
        }
        
    }
}
