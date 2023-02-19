package Lists_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
        	.map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {

           numbers.removeIf(n -> n < 0);
        }

        Collections.reverse(numbers);

        if(numbers.isEmpty()){
            System.out.println("empty");
        }else{
            System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
        }


    }
}
