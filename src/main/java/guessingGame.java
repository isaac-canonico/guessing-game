public class guessingGame {

	public String playGame(int yourNumber) {

		int guessNumber = 0;
		
		while (guessNumber <=2) {
			
	    if (yourNumber == 0) {
	    	guessNumber += 1;
			return "Please enter a value between 1 and 10, NOT ZERO";

		} else if (yourNumber > 7 && yourNumber > 0) {
			guessNumber += 1;
			return "Loser, The number is lower!";

		} else if (yourNumber < 7 && yourNumber > 0) {
			guessNumber += 1;
			return "Loser! The number is higher!";
		
		} else if (yourNumber == 7) {
			guessNumber += 1;
			return "Winner";
			
		} else if (yourNumber == -1) {
			guessNumber += 1;
			return "Youre done"; 
			
		}
		
		return null;
		
	}

}
	
	
