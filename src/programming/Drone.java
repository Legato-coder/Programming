package programming;

public class Drone {
    
   
	
	
	    static int oversPlayed = 0; // Static variable to track overs played

	    static void updateOvers(int overs) {
	        oversPlayed += overs; // Update the number of overs played
	    }

	    static void displayGameStatus() {
	        System.out.println("Overs Played: " + oversPlayed);
	    }

	    public static void main(String[] args) {
	        Player player1 = new Player("Virat");
	        Player player2 = new Player("Rohit");

	        player1.scoreRuns(50);
	        player2.scoreRuns(75);

	        Team.addRuns(player1.runs);
	        Team.addRuns(player2.runs);

	        updateOvers(10); // Update the overs played
	        displayGameStatus(); // Display game status
	    }
	}

    	
    
}
