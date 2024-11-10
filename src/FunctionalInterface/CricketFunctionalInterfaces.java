package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Function;

public class CricketFunctionalInterfaces {
    public static void main(String[] args) {
        // Consumer Example: Printing cricket player's score
        Consumer<String> printScore = player -> 
        System.out.println(player + " scored 100 runs.  (consumer)");
        printScore.accept("Virat Kohli");

        // Supplier Example: Supplying a default cricket team name
        Supplier<String> teamSupplier = () -> "India National Cricket Team  (supplier)";
        System.out.println("Team: " + teamSupplier.get());

        // Predicate Example: Checking if a player's score is a century
        Predicate<Integer> isCentury = score -> score >= 100;
        System.out.println("(predicate)  Is 120 a century? " + isCentury.test(120));  // Output: true
        System.out.println("(predicate)  Is 85 a century? " + isCentury.test(85));    // Output: false

        // Function Example: Converting runs scored to match outcome (simple logic)
        Function<Integer, String> matchResult = runs -> runs >= 300 ? "High scoring match" : "Low scoring match";
        System.out.println("(Function) Match result for 320 runs: " + matchResult.apply(320));  // Output: High scoring match
        System.out.println("(Function) Match result for 250 runs: " + matchResult.apply(250));  // Output: Low scoring match
    }
}
