package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int daysCount = 0;
        int spicesTotal = 0;

        while (startingYield >= 100){

           int spices = startingYield - 26;
           spicesTotal = spicesTotal + spices;
           daysCount++;
           startingYield = startingYield - 10;
        }

           if(spicesTotal >= 26){

               spicesTotal = spicesTotal - 26;
           }

        System.out.println(daysCount);
        System.out.println(spicesTotal);
    }
}
