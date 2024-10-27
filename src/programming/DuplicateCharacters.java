package programming;
//finding duplicate characters in a string
import java.util.HashMap;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String input = "programming";
		findDuplicateCharacters(input);
	}

	public static void findDuplicateCharacters(String str) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		// Count each character's occurrences
		for (char c : str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		// Print duplicate characters
		System.out.println("Duplicate characters in the string:");
		for (char c : charCountMap.keySet()) {
			if (charCountMap.get(c) > 1) {
				System.out.println(c + ": " + charCountMap.get(c) + " times");
			}
		}
	}
}
