package lambdas;
//sort by length
import java.util.Arrays;

public class LambdaExample {
	public static void main(String[] args) {
		String[] words = { "apple", "banana", "kiwi", "grapefruit", "fig", "cherry" };

		// Sort the array using a lambda expression
		Arrays.sort(words, (a, b) -> a.length() - b.length());

		// Print the sorted array
		System.out.println("Sorted array by length:");
		for (String word : words) {
			System.out.println(word);
			
		}
	}
}
