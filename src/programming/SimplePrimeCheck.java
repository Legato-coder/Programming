package programming;

import java.util.Scanner;

public class SimplePrimeCheck {

	public static boolean isPrime(int a) {
		// If the number is less than 2, it's not prime
		if (a < 2) {
			return false;
		}

		// Check for factors from 2 to number - 1
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false; // Found a factor, so it's not prime
			}
		}

		return true; // No factors found, it's prime
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to check if it is prime: ");
		int number = scanner.nextInt();

		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

		scanner.close();
	}
}
