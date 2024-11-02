package streams.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import streams.example1.Person;

public class Main {
	
	public static void main(String[] args) {
		
		List<Person> people=Arrays.asList (
		new Person ("santhosh", 30),
		new Person ("Ann", 25),
		new Person ("kid", 1)	
		);
		 // 1. Filter: Get people older than 28
		List<Person> olderthan25 = people.stream()
				.filter(person -> person.getAge() > 24)
				.collect(Collectors.toList());
		System.out.println("people older than 28"  +olderthan25);
		
		
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
