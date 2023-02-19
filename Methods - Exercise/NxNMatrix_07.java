package Methods_Exercise;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printsNxNMatrix(n);
    }

    private static void printsNxNMatrix(int n){

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {



                    System.out.print(n + " ");

            }
            System.out.println();
        }
    }
}
