//check whether adam num or not

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int input = scanner.nextInt();

        int square = input * input;

        int rev = 0;

        while(input>0){
            rev = rev*10+(input%10);
            input /= 10;
        }

        int squarerev = rev*rev;

        int revsqrrev = 0;

        while(squarerev>0){
            revsqrrev = revsqrrev*10+(squarerev%10);
            squarerev /= 10;
        }

        if (revsqrrev==square ){
            System.out.println("its an adam num");
        } else {
            System.out.println("its not an adam num");
        }

    }
}
