package Methods_Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int result = Math.abs(getMultiplyOfEvensAndOdds(number));
        System.out.println(result);


    }

    public static int getMultiplyOfEvensAndOdds(int number) {

        int resultEven = getEvenSum(number);
        int resultOdd = getOddSum(number);

        return resultEven * resultOdd;

    }

    public static int getEvenSum(int number) {
        int evenSum = 0;
        while(number != 0){

            int lastNum = number % 10;

            if (lastNum % 2 == 0) {
                evenSum += lastNum;
            }

           number = number / 10;

        }
        return evenSum;
    }

    public static int getOddSum(int number) {
        int oddSum = 0;
        while(number != 0) {
            int lastNum = number % 10;

            if (lastNum % 2 != 0) {
                oddSum += lastNum;
            }

            number = number / 10;

        }
        return oddSum;
    }
}
