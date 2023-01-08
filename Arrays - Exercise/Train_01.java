package Arrays_Exercise;

import java.util.List;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] array = new int[n];

        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            array[i - 1] += currentNum;
            sum += currentNum;
        }

        for (int number : array) {

            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
