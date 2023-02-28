package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> player1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> player2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());



        while(player1.size() > 0 && player2.size() > 0) {

            if (player1.get(0) > player2.get(0)) {
                player1.add(player1.get(0));
                player1.add(player2.get(0));
                player1.remove(player1.get(0));
                player2.remove(player2.get(0));

            } else if (player2.get(0) > player1.get(0)) {
                player2.add(player2.get(0));
                player2.add(player1.get(0));
                player2.remove(player2.get(0));
                player1.remove(player1.get(0));

            } else if (player1.get(0) == player2.get(0)) {

                player1.remove(player1.get(0));
                player2.remove(player2.get(0));
            }
        }


        int sumPlayer1 = 0;
        int sumPlayer2 = 0;

        for (int player : player1) {
            sumPlayer1 += player;
        }

        for (int player : player2) {
            sumPlayer2 += player;
        }

        if(sumPlayer1 > sumPlayer2){
            System.out.printf("First player wins! Sum: %d", sumPlayer1);
        }else{
            System.out.printf("Second player wins! Sum: %d", sumPlayer2);
        }

    }
    }



