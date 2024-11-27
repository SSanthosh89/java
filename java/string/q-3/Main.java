//pangram
import java.util.Scanner;

public class Main{
    public static String isanagram(String a1, String a2){
            char a11[] = a1.toCharArray();
            char a12[] = a2.toCharArray();
            int b = a1.length();
            int c = 0;
            
            for(int i=0; i<b; i++){
                if(new String(a12).indexOf(a11[i]) >= 0){
                    c = 0;
                }else{
                    c = 1;
                    return "It is not a Pangram";
                }
            }

        return "It is an Pangram";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = "qwertyuioplkjhgfdsaxzcvbnm";
        String a2 = sc.nextLine();

        String f = isanagram(a1, a2);
        System.out.println(f);
    }

}