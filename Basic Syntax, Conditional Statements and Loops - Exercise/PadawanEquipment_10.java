import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double lightSabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double lightSabersTotal = Math.ceil(countOfStudents * 1.1) * lightSabersPrice;
        double robesTotal = countOfStudents * robesPrice;
        double beltsTotal = (countOfStudents - countOfStudents / 6) * beltsPrice;

       double sum = lightSabersTotal + robesTotal + beltsTotal;

       if(sum <= amountOfMoney){
           System.out.printf("The money is enough - it would cost %.2flv.", sum);
       }else{
           double diff = sum - amountOfMoney;
           System.out.printf("George Lucas will need %.2flv more.", diff);
       }
    }
}
