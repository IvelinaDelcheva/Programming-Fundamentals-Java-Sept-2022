import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10 ; i++) {

            System.out.printf("%d X %d = %d%n", integer, i, integer * i);
        }
    }
}
