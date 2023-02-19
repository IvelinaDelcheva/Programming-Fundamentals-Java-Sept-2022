package Methods_Exercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {


            if (sumOfDigitsDivisibleBy8(number) && holdsAtLeastOneOddDigit(number)) {
                System.out.println(number);
            }
        }


    }

    private static boolean sumOfDigitsDivisibleBy8(int number) {

        int sumDigits = 0;

        while (number > 0) {

            int lastDigit = number % 10;

            sumDigits += lastDigit;

            number = number / 10;
        }

        return sumDigits % 8 == 0;
    }

    private static boolean holdsAtLeastOneOddDigit(int number) {

        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                return true;
            }

            number = number / 10;
        }

        return false;
    }

}
