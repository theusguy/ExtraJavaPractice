/* 
 * Method public static void main(String[] args)
 * Declare an int variable to hold the number of user guesses named userGuesses
 * Make a SimpleDotCom object
 * Compute a random number between 0 and 4 that will be the starting location cell position
 * Use randomNumber and two consecutive numbers to create an array
 * While the SimpleDotCom is still alive:
 * Get user input from the command line 
 * Check user input 
 * Break when object is dead
 * Tell users how many guesses it took
 */
public class SimpleDotComGame {
	public static void main(String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		//Creating a DotCom Object (BATTLESHIP)
		SimpleDotCom theDotCom = new SimpleDotCom();
		int randomNum = (int) (Math.random() * 5);
		//Setting a location and ssending that array to the DotCom object and setting the battlefield to isAlive
		int[] locations = {randomNum, randomNum + 1, randomNum + 2};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		//A loop that lets users run as many times necessary to kill the battleship!
		while (isAlive == true) {
			String guess = helper.getUserInput("Enter a Number");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			} //end if
		} //end while
	} //end main

} //end class
