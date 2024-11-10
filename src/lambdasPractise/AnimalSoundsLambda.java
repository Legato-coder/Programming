package lambdasPractise;

public class AnimalSoundsLambda {
	
	public static void main(String[] args) {
		
		// Lambda for a dog sound
        AnimalSound dogSound = () -> System.out.println("Dog: BWoof BWoof!");
        
        // Lambda for a cat sound
        AnimalSound catSound = () -> System.out.println("Cat: Meow Meow!");

        // Lambda for a cow sound
        AnimalSound cowSound = () -> System.out.println("Cow: Moo Moo!");

        
        // Using the lambdas
       dogSound.makesound(); 
       catSound.makesound();
       cowSound.makesound();
       
		
	}

}
