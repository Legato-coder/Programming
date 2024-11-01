package testPackages;

class BollywoodActor extends Actor {
	String movie;

	// Constructor for BollywoodActor
	BollywoodActor(String name, String movie) {
		super(name); // Call the constructor of Actor
		this.movie = movie;
	}

	// Overriding display method
	@Override
	void display() {
		super.display(); // Call the display method of Actor
		System.out.println("Famous for movie: " + movie);
	}

	public static void main(String[] args) {
		BollywoodActor actor = new BollywoodActor("Shah Rukh Khan", "Dilwale Dulhania Le Jayenge");
		actor.display();
	}
}
