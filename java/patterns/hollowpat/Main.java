import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i=1;i<=input;i++){
            for(int j=1;j<=i;j++){
                if(j == 1 || i == j || i == input && j==input){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=input-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(i == 1 || i == j || j==1 || i == input-1 && j==1 || j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}
