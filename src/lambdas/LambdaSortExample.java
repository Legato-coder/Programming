package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {

	
	
	    public static void main(String[] args) {
	       List <Integer> numbers = Arrays.asList(5, 3, 8, 1, 4);

	        // Sorting the list using a lambda expression
	        Collections.sort(numbers, (a, b) -> a.compareTo(b));

	        // Printing the sorted list
	        System.out.println("Sorted numbers: " + numbers);
	    }
	}

