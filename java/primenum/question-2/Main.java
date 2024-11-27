//find prime withinthe list

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,7,11,12,17,19,89,83,97};

        int flag,i;

        for (int num:array){
            flag=0;
            for(i=2; i<=num/2; i++){
                if (num%i==0){
                    flag=1;
                    break;
                }
            }
        
            if(flag==0 && num>1){
                System.out.println(num);
            }
        }
        }
        
}
