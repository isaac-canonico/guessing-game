import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class guessingGameTest {

	guessingGame underTest = new guessingGame();

	// When the user guesses 7, the game announces they have won. All other numbers
	// lose.

	@Test
	public void shouldSayWinnerForValueSeven() {
		String response = underTest.playGame(7);
		assertEquals("Winner", response);
	}

	// for example, using integer = 6 as the input:

	@Test
	public void shouldtellUserHigher() {
		String response = underTest.playGame(6);
		assertEquals("Loser! The number is higher!", response);
		
	}
	
	@Test
	public void shouldTellUserLower() {
		String response = underTest.playGame(8);
		assertEquals("Loser, The number is lower!", response);
		
	}
	
	// When the user guesses 0, the game provides instructions for the user.
	
	@Test
	public void shouldGiveInstructionsForValueZero() {
		String response = underTest.playGame(0);
		assertEquals("Please enter a value between 1 and 10, NOT ZERO", response);
	
	}
	
	// if the user enters -1 the application should exit
	
	@Test
	public void applicationClosesIfUserEntersNegativeOne() {
		String response = underTest.playGame(-1);
		assertEquals("Youre done", response);
		
	}
	

}
