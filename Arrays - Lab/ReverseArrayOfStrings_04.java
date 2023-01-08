package Arrays_Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split(" ");

        for (int i = 0; i < inputLine.length / 2 ; i++) {

            String oldElement = inputLine[i];
            inputLine[i] = inputLine[inputLine.length - 1 - i];
            inputLine[inputLine.length - 1 - i] = oldElement;

        }

        System.out.println(String.join(" ", inputLine));

    }
}
