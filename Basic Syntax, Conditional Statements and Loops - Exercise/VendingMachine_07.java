import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double totalMoney = 0;
        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);

            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {

                System.out.printf("Cannot accept %.2f%n", coins);
            } else {
                totalMoney = totalMoney + coins;
            }

            input = scanner.nextLine();
        }


        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String product = command;


            if (product.equals("Nuts")) {

                if (totalMoney < 2.0) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney = totalMoney - 2.0;
                    System.out.println("Purchased Nuts");
                }
            } else if (product.equals("Water")) {

                if (totalMoney < 0.7) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney = totalMoney - 0.7;
                    System.out.println("Purchased Water");
                }
            } else if (product.equals("Crisps")) {

                if (totalMoney < 1.5) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney = totalMoney - 1.5;
                    System.out.println("Purchased Crisps");
                }
            } else if (product.equals("Soda")) {

                if (totalMoney < 0.8) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney = totalMoney - 0.8;
                    System.out.println("Purchased Soda");
                }
            } else if (product.equals("Coke")) {

                if (totalMoney < 1.0) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney = totalMoney - 1.0;
                    System.out.println("Purchased Coke");
                }
            } else {
                System.out.println("Invalid product");
            }


            command = scanner.nextLine();

        }


        System.out.printf("Change: %.2f", totalMoney);
    }
}



