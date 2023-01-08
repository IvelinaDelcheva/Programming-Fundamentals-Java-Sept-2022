package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();

        boolean isTop = false;

        for (int i = 0; i < array.length ; i++) {

            isTop = true;

            for (int j = i + 1; j < array.length ; j++) {
                if(array[i] <= array[j]){
                    isTop= false;
                }

            }
            
            if(isTop){
                System.out.print(array[i] + " ");
            }
        }
    }
}
