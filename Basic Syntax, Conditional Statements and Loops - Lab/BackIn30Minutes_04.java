import java.util.Scanner;

public class BackIn30Minutes_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initHours = Integer.parseInt(scanner.nextLine());
        int initMinutes = Integer.parseInt(scanner.nextLine());

        int allMin = (initHours * 60) + initMinutes + 30;

        int hours = allMin / 60;
        int minutes = allMin % 60;

        if(hours > 23){
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
