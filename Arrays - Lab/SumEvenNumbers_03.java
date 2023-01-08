package Arrays_Lab;

import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];

        int sum = 0;

        for (int i = 0; i < input.length ; i++) {
            arr[i] = Integer.parseInt(input[i]);

            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }

        System.out.println(sum);

        }
    }

