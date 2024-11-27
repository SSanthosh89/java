//finding not safe word in the input

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int len = 0,count1=0,count2=0;
        String as = sc.nextLine();
        char a[] = as.toCharArray();
        
        len = a.length;
        int j=0,i;
        char b[] = {'n','o','t',' '};

        for(i=0;i<len;){
            if(a[i] == b[j]){
                System.out.println(a[i]+" "+b[j]);
            
            j++;
            if(j==3){
                j=0;
                count1++;
            }}else{
                j=0;
            }
            i++;
        }

        for(i=0;i<len;i++){
            if(a[i]==','){
                count2++;
            }
        }
        count2++;

        double res = ((double)count1/(double)count2)*100;

        System.out.println(count1);
        System.out.println(count2);
        System.out.println("Res"+res);

    }
    
}
