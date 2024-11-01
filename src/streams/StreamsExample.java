package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

		// Intermediate operations
		List<String> filteredAndSortedNames = names.stream().filter(name -> name.length() > 3) // Intermediate
				.sorted() // Intermediate
				.collect(Collectors.toList()); // Terminal

		// Output the results
		System.out.println(filteredAndSortedNames); // [Alice, Charlie, David]
	}
}
