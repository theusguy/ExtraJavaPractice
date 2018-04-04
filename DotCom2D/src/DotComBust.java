import java.util.ArrayList;

public class DotComBust {
			int numOfGuesses = 0;
			ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
			GameHelper helper = new GameHelper();
			
			
			private void setUpGame() {
				//Creating 3 DotCom Object (BATTLESHIPS)
				DotCom one = new DotCom();
				DotCom two = new DotCom();
				DotCom three = new DotCom();
				//Setting a name for each DotCom
				one.setName("Pets.com");
				two.setName("eToys.com");
				three.setName("Go2.com");
				//Adding names to the ArrayList
				dotComsList.add(one);
				dotComsList.add(two);
				dotComsList.add(three);
				//Setting each DotCom to a randomly selected coordinates on grid
				for (DotCom holder : dotComsList) {
					//ArrayList in which the coordinates will be saved
					ArrayList<String> newLocation = helper.placeDotCom(3);
					//use the current DotCom on the for Loop and call on its setLocationCells to unload the random location.
					holder.setLocationCells(newLocation);
				} //end for
			} // end setUpGame
			
			private void startPlaying() {
				while (dotComsList.isEmpty() == false) {
					//Saves user guess in userGuess and sends it into checkUserGuess method
					String userGuess = helper.getUserInput("Enter a guess");
					checkUserGuess(userGuess);
				} //end while
				finishGame();
			} //end startPlaying
			
			private void checkUserGuess(String userGuess) {
				//Updates num of Shots fired and keeps default result: missed.
				numOfGuesses++;
				String result = "miss";
				//Running a for loop to individually test each object against checkYourself method for possible hit/kill.
				for (DotCom dotComToTest : dotComsList) {
					result = dotComToTest.checkYourself(userGuess);
					if (result.equals("hit")) {
						break;
					} //end if
					if (result.equals("kill")) {
						dotComsList.remove(dotComToTest);
						break;
					} //end if
				} //end for
				System.out.println(result);
			} //end method
			
			private void finishGame() {
				System.out.println("All DotComs are dead! Your stock is now worthless.");
				if (numOfGuesses <= 18 ) {
					System.out.println("It only took you " + numOfGuesses + " guesses.");
					System.out.println(" You got out before your options sank");
				} else {
					System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
					System.out.println("Fish are dancing with your options");
				} //end if
			} //end finishGame
			
			public static void main(String[] args) {
				DotComBust game = new DotComBust();
				game.setUpGame();
				game.startPlaying();
			} //end main

	} //end class

