package streams.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import streams.example1.Person;

public class A2 {
	
	public static void main(String[] args) {
		
		List<A1> employees=Arrays.asList (
				new A1("peter", 500),
				new A1 ("Alicia", 2000),
				new A1 ("Jacob", 3000),
				new A1("Alicia", 4000),
				new A1("Den", 600)
				);
				//filtering emplyess salary more than 1000
				
				List<A1> morethan1000 = employees.stream()
				.filter(emptest -> emptest.getEsalary() > 1000)
				.collect(Collectors.toList());
		System.out.println("people salary more than 1000 :  "  +morethan1000);
				
				
				
				
				
				
				
		
	}
	

}
