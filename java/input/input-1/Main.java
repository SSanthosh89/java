import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<11; i++){
            int input= sc.nextInt();
            System.out.println("input "+i+" = "+input);
        }
    }
}
