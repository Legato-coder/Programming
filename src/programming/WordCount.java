package programming;

import java.util.HashMap;

//Java program to count the number of words in a string using a HashMap
public class WordCount {
	public static void main(String[] args) {
		String text = "This is a sample text and this text is just a sample";

		// Count words and print results
		countWords(text);
	}

	public static void countWords(String text) {
		HashMap<String, Integer> wordCountMap = new HashMap<>();

		// Split the text into words
		String[] words = text.toLowerCase().split("\\s+");

		// Count each word
		for (String word : words) {
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		}

		// Print the word count
		wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
	}
}
