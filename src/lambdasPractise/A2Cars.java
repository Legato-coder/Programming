package lambdasPractise;

public class A2Cars {
	
	public static void main(String[] args) {
		
	A1CarSound Nissan= ()-> System.out.println("Nissan Car");
	A1CarSound Maruti = () -> System.out.println("Maruti Car");
	A1CarSound Tata = () -> System.out.println("Tata car");
	
	Nissan.carSound();
	Maruti.carSound();
	Tata.carSound();
		
	}

}
