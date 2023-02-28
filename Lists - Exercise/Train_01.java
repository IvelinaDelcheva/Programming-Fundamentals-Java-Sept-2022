package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacityOfWagon = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String [] commandLine = input.split(" ");

            if (commandLine.length == 2) {

                String command = input.split(" ")[0];
                int passengers = Integer.parseInt(input.split(" ")[1]);
                wagons.add(passengers);
            } else {

                int passengersToAdd = Integer.parseInt(commandLine[0]);

                for (int i = 0; i < wagons.size(); i++) {

                    int passengers = wagons.get(i);

                    if(passengersToAdd + passengers <= maxCapacityOfWagon){
                        wagons.add(i, passengers + passengersToAdd);
                        wagons.remove(i + 1);
                        break;
                    }

                }
            }

            input = scanner.nextLine();
        }

        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
