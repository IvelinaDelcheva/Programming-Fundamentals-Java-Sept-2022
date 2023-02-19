package Methods_Exercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();


        if (passwordConsist6to10Characters(password) &&
                passwordConsistOnlyOfLettersAndDigits(password) &&
                passwordHaveAtLeast2Digits(password)) {
            System.out.println("Password is valid");
        }
        if (!passwordConsist6to10Characters(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!passwordConsistOnlyOfLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!passwordHaveAtLeast2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean passwordConsist6to10Characters(String password) {

        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean passwordConsistOnlyOfLettersAndDigits(String password) {

        for (char symbol : password.toCharArray()) {

            if (!Character.isLetterOrDigit(symbol)) {

                return false;
            }
        }

        return true;

    }

    private static boolean passwordHaveAtLeast2Digits(String password) {

        int counter = 0;
        for (char symbol : password.toCharArray()) {

            if (Character.isDigit(symbol)) {
                counter++;
            }
        }

        if (counter >= 2) {
            return true;
        } else {
            return false;
        }

    }
}