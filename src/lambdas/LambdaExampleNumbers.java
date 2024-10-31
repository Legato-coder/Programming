package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExampleNumbers {
    public static void main(String[] args) {
        Integer[] numbers = {12, 5, 8, 21, 34, 7, 3, 18};

        // Convert the array to a list and filter even numbers using a lambda expression
        List<Integer> evenNumbers = Arrays.stream(numbers)
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        // Print the even numbers
        System.out.println("Even numbers in the array:");
        evenNumbers.forEach(System.out::println);
    }
}
