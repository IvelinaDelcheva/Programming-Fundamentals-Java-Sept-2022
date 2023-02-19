package Lists_Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
        	.map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {

            if(numbers.get(i).equals(numbers.get(i + 1))){
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i = -1;
            }
        }

        System.out.println(joinElementByDelimiter(numbers, " "));
    }

    private static String joinElementByDelimiter(List<Double> numbers, String delimiter){
        String output = "";

        for (Double item : numbers) {
            DecimalFormat df = new DecimalFormat("0.#");
            String numFormat = df.format(item) + delimiter;

            output += numFormat;
        }

        return output;
    }
}
