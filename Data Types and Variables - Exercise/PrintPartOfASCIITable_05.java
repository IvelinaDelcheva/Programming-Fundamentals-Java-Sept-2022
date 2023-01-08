package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine());
        int endCode = Integer.parseInt(scanner.nextLine());

        for (int symbol = startCode; symbol <= endCode ; symbol++) {

            System.out.print((char) symbol + " ");
        }


    }
}
