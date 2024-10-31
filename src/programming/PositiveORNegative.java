package programming;

import java.util.Scanner;

public class PositiveORNegative {
	
	
	//find number is postive or Neg
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number ::  ");
		Double number=scanner.nextDouble();
		
		if( number > 0) {
			System.out.println("it is a postive number");
		} else {
			System.out.println("it is a Neg number");
		}
		
		
		
	}

}
