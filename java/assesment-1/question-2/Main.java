public class Main{
    public static void main(String[] args){
        int[] array = {18, 82, 282, 32, 494, 24};
        int sum = 0;

        for (int num:array){
            if (contains8(num)){
                sum += num ;
            }
        }
        System.out.println("sum of digit with 8 in it = " + sum);
    }
    public static boolean contains8(int num){
            num = Math.abs(num);
            
            while(num > 0){
                if(num % 10==8){
                    return true;
                }
                num /= 10;
            }
            return false;
    }
    
}