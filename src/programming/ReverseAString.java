package programming;

public class ReverseAString {
	
	public static void main(String[] args) {
		
		String test="hello world";
		StringBuilder buildtest=new StringBuilder();
		buildtest.append(test);
		buildtest.reverse();
		System.out.println(buildtest);
		
		
		
	}

}
