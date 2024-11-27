import java.util.*;

class Main {
    public String count(int n){
        String num = "1";
        while(n>1){
            num = solve(num);
            n--;
        }
        return num;
    }

    String solve(String n){
        StringBuilder sb = new StringBuilder();
        int len = n.length(),i,j=0;
        for(i=0; i<len;){
            while(j<len && n.charAt(j) == n.charAt(i))
            j++;
            sb.append(j-i).append(n.charAt(i));
            i = j;
        }
        return sb.toString();
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);     
        int n=sc.nextInt();
        Main cs = new Main();
        System.out.println(cs.count(n));
    }
    
}
