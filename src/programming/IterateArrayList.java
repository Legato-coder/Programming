package programming;

import java.util.ArrayList;

public class IterateArrayList {
	public static void main(String[] args) {
		// Create an ArrayList and add some elements
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");

		// 1. Using a traditional for loop
		System.out.println("Using a traditional for loop:");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}

		// 2. Using a while loop
		System.out.println("\nUsing a while loop:");
		int index = 0;
		while (index < fruits.size()) {
			System.out.println(fruits.get(index));
			index++;
		}

		// 3. Using an enhanced for loop (for-each loop)
		System.out.println("\nUsing an enhanced for loop:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
