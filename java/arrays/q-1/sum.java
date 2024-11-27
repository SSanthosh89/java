import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int even=0,odd=0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i]%2==0){
                even += a[i];
            }else{
                odd += a[i];
            }
        }
        System.out.println("even = "+ even);
        System.out.println("odd = "+ odd);
        
        
    }
}