package Arrays_Exercise;

import java.util.Scanner;

public class Zig_ZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int row = 1; row <= n; row++) {
            String numbers = scanner.nextLine();

            int firstNUmber = Integer.parseInt(numbers.split(" ")[0]);
            int secondNUmber = Integer.parseInt(numbers.split(" ")[1]);

            if (row % 2 == 0) {
                firstArray[row - 1] = secondNUmber;
                secondArray [row - 1] = firstNUmber;
            } else {
                firstArray[row - 1] = firstNUmber;
                secondArray [row - 1] = secondNUmber;
            }
        }

        for (int number : firstArray) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int number : secondArray) {

            System.out.print(number + " ");

        }

    }
}
