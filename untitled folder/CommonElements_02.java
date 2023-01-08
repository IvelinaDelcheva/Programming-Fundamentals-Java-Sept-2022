package Arrays_Exercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String secondElement : secondArray) {

            for (String firstElement : firstArray) {

                if(firstElement.equals(secondElement)){

                    System.out.print(firstElement + " ");
                    break;
                }

            }

        }

    }

}

