package Lists_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            List<String> commandLine = Arrays.stream(input.split(" "))
                    .collect(Collectors.toList());

            String command = commandLine.get(0);
            int element = Integer.parseInt(commandLine.get(1));

            switch (command) {
                case "Delete":
                    numbers.removeAll(Arrays.asList(element));
                    break;
                case "Insert":
                    int posisiton = Integer.parseInt(commandLine.get(2));
                    numbers.add(posisiton, element);
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
