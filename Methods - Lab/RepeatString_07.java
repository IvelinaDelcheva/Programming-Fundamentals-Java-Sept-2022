package Methods_Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        String result = repeatedString(input, count);
        System.out.println(result);
    }

    public static String repeatedString(String input, int count) {

        String repeatedInput = "";

        for (int i = 1; i <= count; i++) {
            repeatedInput += input;
        }

        return repeatedInput;
    }
}
