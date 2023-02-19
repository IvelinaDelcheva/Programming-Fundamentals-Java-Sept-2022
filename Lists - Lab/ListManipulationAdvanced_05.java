package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {


            if (command.contains("Contains")) {
                int containsNumber = Integer.parseInt(command.split("\\s+")[1]);
                if (numbers.contains(containsNumber)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.contains("Print even")) {
                for (int number : numbers) {
                    if (number % 2 == 0) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
            } else if (command.contains("Print odd")) {
                for (int number : numbers) {
                    if (number % 2 != 0) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
            } else if (command.contains("Get sum")) {
                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                System.out.println(sum);
            } else if (command.contains("Filter")) {
                String condition = command.split("\\s+")[1];
                int number = Integer.parseInt(command.split("\\s+")[2]);

                if (condition.equals("<")) {
                    for (int item : numbers) {
                        if (item < number) {
                            System.out.print(item + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals(">")) {
                    for (int item : numbers) {
                        if (item > number) {
                            System.out.print(item + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals(">=")) {
                    for (int item : numbers) {
                        if (item >= number) {
                            System.out.print(item + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals("<=")) {
                    for (int item : numbers) {
                        if (item <= number) {
                            System.out.print(item + " ");
                        }
                    }
                    System.out.println();
                }
            }

            command = scanner.nextLine();
        }
    }
}
