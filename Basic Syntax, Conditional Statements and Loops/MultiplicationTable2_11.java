import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        if(times > 10){
            System.out.printf("%d X %d = %d%n", integer, times, integer * times);
        }

        for (int i = times; i <= 10 ; i++) {

            System.out.printf("%d X %d = %d%n", integer, i, integer * i);
        }
    }
}
