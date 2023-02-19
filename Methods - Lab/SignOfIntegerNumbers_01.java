package Methods_Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        printSignOfNumber(number);
    }

    public static void printSignOfNumber(int number){

        if(number > 0){
            System.out.printf("The number %d is positive.", number);
        }else if(number < 0){
            System.out.printf("The number %d is negative.", number);
        }else{
            System.out.printf("The number %d is zero.", number);
        }
    }
}
