
public class Main {
    public static void main(String[] args) {
        int num = 2;
        switch (num % 4) {
            case 0: 
                num = num + 10;
      
            case 1:
                num = num + 8;
        
            case 2:
                num = num + 7;
       
            case 3:  
                num = num + 6;
       
            default:
                num = num - 5;
        }
    }
}
