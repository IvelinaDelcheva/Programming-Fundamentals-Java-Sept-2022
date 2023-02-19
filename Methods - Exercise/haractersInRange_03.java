package Methods_Exercise;

import java.util.Scanner;

public class haractersInRange_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char character1 = scanner.nextLine().charAt(0);
        char character2 = scanner.nextLine().charAt(0);

        printAllCharactersBetween(character1, character2);


    }

    private static void printAllCharactersBetween(char character1, char character2) {

        if(character1 < character2) {

            for (int currentChar = character1 + 1; currentChar < character2; currentChar++) {

                System.out.print((char) currentChar + " ");

            }
        }else {

            for (int currentChar = character2 + 1; currentChar < character1; currentChar++) {

                System.out.print((char) currentChar + " ");
            }
        }

    }

}
