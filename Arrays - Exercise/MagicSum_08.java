package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {


                int product = array[i] + array[j];

                if (product == n) {

                    System.out.println(array[i] + " " + array[j]);
                }
            }

        }
    }
}