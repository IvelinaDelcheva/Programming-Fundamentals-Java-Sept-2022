package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distances = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumRemoved = 0;
        while (distances.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {

                int fistElement = distances.get(0);
                sumRemoved += fistElement;
                int lastElement = distances.get(distances.size() - 1);
                distances.set(0, lastElement);
                modifyList(distances, fistElement);


            } else if (index > distances.size() - 1) {

                int fistElement = distances.get(0);
                int lastElement = distances.get(distances.size() - 1);
                sumRemoved += lastElement;
                distances.set(distances.size() - 1, fistElement);
                modifyList(distances, lastElement);


            } else if (index >= 0 && index <= distances.size() - 1) {

                int removedElement = distances.get(index);
                sumRemoved += removedElement;
                distances.remove(index);
                modifyList(distances, removedElement);
            }
        }


        System.out.println(sumRemoved);

    }

    public static void modifyList(List<Integer> distances, int removedElement) {

        for (int index = 0; index <=  distances.size() - 1; index++) {

            int currentElement = distances.get(index);
            if (currentElement <= removedElement) {
                currentElement += removedElement;
            } else {
                currentElement -= removedElement;
            }

            distances.set(index, currentElement);
        }
    }
}
