package exceptionHandling;

public class ExceptionHandlingExample {
	
	public static void main(String[] args) {
		
		try {
			int[] numbers = {1,2,3};
			System.out.println(numbers[3]);
			int resultd =10/0;
			
		} catch (ArithmeticException e) {
			System.out.println("arith exception");
			
		} catch (ArrayIndexOutOfBoundsException eA) {
			System.out.println("index exception");
		} catch (NullPointerException en) {
			System.out.println("Null pointer execetpin");
		} finally {
			System.out.println("This will be executed Anyway");
		}
		
		
	}

}
