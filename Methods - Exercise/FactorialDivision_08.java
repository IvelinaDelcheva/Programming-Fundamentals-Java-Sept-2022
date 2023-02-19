package Methods_Exercise;


import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        double result = calculateFactorial(number1) * 1.0 / calculateFactorial(number2);
        System.out.printf("%.2f", result);
    }

    private static long calculateFactorial (int number){

        long factorial = 1;
        for (int i = 1; i <= number ; i++) {

            factorial *= i;
        }

        return factorial;

    }
}
