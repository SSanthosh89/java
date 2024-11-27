import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        for(int i=0;i<input1;i++){
            for(int j=0; j<=i; j++){
                System.out.print(input2+" ");
            }
            input2 +=1;
            System.out.println("");
        }

        input2--;

        for(int i=input1;i>0;i--){
            for(int j=i; j>0; j--){
                System.out.print(input2+" ");
            }
            input2 -=1;
            System.out.println("");
        }
    }
}
