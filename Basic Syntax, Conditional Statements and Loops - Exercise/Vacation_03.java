import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double pricePerNight = 0;



        if (typeOfGroup.equals("Students")) {
            if (dayOfWeek.equals("Friday")) {
                pricePerNight = groupOfPeople * 8.45;
                if (groupOfPeople >= 30) {
                    pricePerNight = pricePerNight * 0.85;
                }
            } else if (dayOfWeek.equals("Saturday")) {
                pricePerNight = groupOfPeople * 9.80;
                if (groupOfPeople >= 30) {
                    pricePerNight = pricePerNight * 0.85;
                }
            } else if (dayOfWeek.equals("Sunday")) {
                pricePerNight = groupOfPeople * 10.46;
                if (groupOfPeople >= 30) {
                    pricePerNight = pricePerNight * 0.85;
                }
            }
        } else if (typeOfGroup.equals("Business")) {
            if (dayOfWeek.equals("Friday")) {
                pricePerNight = groupOfPeople * 10.90;
                if (groupOfPeople >= 100) {
                    pricePerNight = (groupOfPeople - 10) * 10.90;
                }
            } else if (dayOfWeek.equals("Saturday")) {
                pricePerNight = groupOfPeople * 15.60;
                if (groupOfPeople >= 100) {
                    pricePerNight = (groupOfPeople - 10) * 15.60;
                }
            } else if (dayOfWeek.equals("Sunday")) {
                pricePerNight = groupOfPeople * 16;
                if (groupOfPeople >= 100) {
                    pricePerNight = (groupOfPeople - 10) * 16;
                }
            }
        } else if (typeOfGroup.equals("Regular")) {
            if (dayOfWeek.equals("Friday")) {
                pricePerNight = groupOfPeople * 15;
                if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                    pricePerNight = pricePerNight * 0.95;
                }
            } else if (dayOfWeek.equals("Saturday")) {
                pricePerNight = groupOfPeople * 20;
                if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                    pricePerNight = pricePerNight * 0.95;
                }
            } else if (dayOfWeek.equals("Sunday")) {
                pricePerNight = groupOfPeople * 22.50;
                if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                    pricePerNight = pricePerNight * 0.95;
                }
            }
        }

        System.out.printf("Total price: %.2f", pricePerNight);
    }
}
