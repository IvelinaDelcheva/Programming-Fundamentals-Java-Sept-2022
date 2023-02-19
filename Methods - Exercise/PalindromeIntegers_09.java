package Methods_Exercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        while(!number.equals("END")){


            if(isPalindromeInteger(number)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

            number = scanner.nextLine();
        }


    }

    private static boolean isPalindromeInteger(String number){

        String[] input = number.split("");
        String reverse = "";

        for (int i = input.length - 1; i >= 0 ; i--) {
            reverse += input[i];
        }


        if(number.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }

}
