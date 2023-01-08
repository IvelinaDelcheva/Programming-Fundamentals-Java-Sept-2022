package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int total = 0;

        for (int i = 1; i <= n; i++) {

            int quantityOfWater = Integer.parseInt(scanner.nextLine());

            if (total + quantityOfWater > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                total += quantityOfWater;
            }
        }
        System.out.println(total);
    }
}
