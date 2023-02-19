package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        double result = raisedToPower(number, power);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    public static double raisedToPower(double number, double power) {

        double result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;
    }
}
