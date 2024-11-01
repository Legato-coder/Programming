package streams.example1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Santhosh", 30),
            new Person("Ann", 26),
            new Person("Charlie", 55),
            new Person("David", 60),
            new Person("Srinu", 1)
        );

        // 1. Filter: Get people older than 28
        List<Person> olderThan28 = people.stream()
            .filter(person -> person.getAge() > 28) // Intermediate operation
            .collect(Collectors.toList());
        
        System.out.println("People older than 28: " + olderThan28);

        // 2. Map: Get a list of names of the people
        List<String> names = people.stream()
            .map(Person::getName) // Intermediate operation
            .collect(Collectors.toList());

        System.out.println("Names of people: " + names);

        // 3. Sorted: Sort people by age
        List<Person> sortedByAge = people.stream()
            .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())) // Intermediate operation
            .collect(Collectors.toList());

        System.out.println("Sorted by age: " + sortedByAge);

        // 4. Distinct: Get distinct ages
        List<Integer> distinctAges = people.stream()
            .map(Person::getAge) // Intermediate operation
            .distinct()          // Intermediate operation
            .collect(Collectors.toList());

        System.out.println("Distinct ages: " + distinctAges);
    }
}

