import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int passwordCount = 0;

        for (int position = username.length() - 1; position >= 0 ; position--) {
            char currentSymbol = username.charAt(position);

            password = password + currentSymbol;
        }

        String enteredPassword = scanner.nextLine();
        while(!enteredPassword.equals(password)){

            passwordCount++;

            if(passwordCount == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");

            enteredPassword = scanner.nextLine();
        }


        if(enteredPassword.equals(password)){

            System.out.printf("User %s logged in.", username);
        }


    }
}
