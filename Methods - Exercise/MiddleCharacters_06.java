package Methods_Exercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

       printsMiddleCharacter(text);
    }

    private static void printsMiddleCharacter(String text){

        String[] input = text.split("");



            if(input.length % 2 != 0){

                System.out.println(input[input.length / 2]);

        }else {
                System.out.println(input[input.length / 2 - 1 ] + (input[input.length / 2]));
            }

    }
}
