package Methods_Exercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(number1, number2, number3));

    }

    private static int sum(int number1, int number2){

        return number1 + number2;
    }

    private static int subtract (int number1, int number2, int number3){

      return sum(number1, number2) - number3;




    }
}
