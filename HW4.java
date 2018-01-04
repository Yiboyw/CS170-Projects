/* Name: Yibo Wang
UserID: ywan738
Section: 006
Collaboration Statement: I used the Think Java @ Emory textbook and collaborated with Rohan Bansal and Brittany Nixon. 
*/

import java.util.Scanner;

public class HW4 {
	static Scanner playerChoice = new Scanner(System.in); 
	static int playerScore = 0;
	static int computerScore = 0;
		
	public static void main(String[] args) {
			System.out.println("Let the Game of Pig begin!");
			playGame("Ben"); //Ben, get ready to play Pig!!! 
			
	}
	
	public static int roll() {
			int random = (int)(1+(Math.random()*6)); //Generates numbers from 1-6. 
			System.out.println("Roll: " + random); //Prints out the generated number. 
			return random;
			//This roll() method generates numbers 1-6 and will act as the dice. 
	}
	
	public static int holdAt20(int computerScore) {
			computerScore = 0; //Calculates the total score of all the turns. 
			int random = 0; 
			//The variable random will be the starting value of the dice roll. 
			int turnTotal = 0; 
			//The variable turnTotal will store the total sum of dice rolls in each turn. 
		
					while(turnTotal <20) { 
				
							random = roll();
							
							if (random == 1) { 
							//When the dice roll generates 1, the total dice roll total is 0. 
							System.out.println("Turn Total: 0");
							return 0;
							}
							
							else {
							turnTotal += random;
							computerScore += turnTotal;	
							/*This while loop makes sure that as long as the 
							 * total dice roll is less than or equal to 20, the dice will continue to generate numbers.*/
							
							}
					}
							if (turnTotal >= 20) {
							computerScore += turnTotal;	
							System.out.println("Turn Total: " +turnTotal);
							return turnTotal;
							
							}
																	
							if (computerScore >= 100) {
								return turnTotal;
							}
							return turnTotal;
							
		}
	  	public static int holdUI() { 
				
				System.out.println("Press 1 to Roll, 2 to Hold.");
				//The program begins by prompting the user to press either the 1 or 2 key. 
				int choice = playerChoice.nextInt();	
				
				//The variable choice will store the number that the user inputs into the Scanner object playerChoice. 
				int turnTotal = 0;
				int roll = 0;
			
				while (choice == 1){
					roll = roll(); //Calls the roll() method to start generating dice rolls. 
					turnTotal += roll; //Adds the dice roll together to get the turn total.
					if (roll == 1){
					   System.out.println("Turn total: 0");
					   return 0; }
							
							else {
							System.out.println("Turn total: " + turnTotal);
							System.out.println("Press 1 to Roll, 2 to Hold.");
							choice = playerChoice.nextInt();
							/*This creates a while loop that as long as the user input is 1, the roll() method will continue to generate dice rolls.
							 * However, if the random number generated is 0, the method returns 0 and stops generating dice rolls.  
							 */
							
							}
					if (choice > 1){ 
					System.out.println("Turn total: " + turnTotal);
					return turnTotal;
					//When the user inputs a 2, the roll() method stops and the program prints out the total dice rolls. 
					}
						
				}
				return turnTotal; 
				//This last return statement is just to make sure the holdUI method returns an integer variable. 
		}
		
		public static int playGame(String playerName) {
				
				int firstPlayer = (int) (1 + (Math.random() * 2));					
				int totalPlayer1Score = 0; 
				int totalComputerScore = 0;
				System.out.println(playerName +", you will be Player " + firstPlayer ); //Begins by assigning the player as either player 1 or player 2.
	
				while (totalPlayer1Score < 100 && totalComputerScore < 100) {
					
					if (firstPlayer == 1) { //If the random number generator generates 1, then player goes first. 

					System.out.println("It is Player 1's turn."); //Tell the computer it's turn.
					int player1Score = holdUI();
					//Makes a variable called player1Score that will store the return value for the player input method.
					
					totalPlayer1Score += player1Score; 
					//Adds up the total score for the player after each turn.
					
					System.out.println("Player 1's score: " + totalPlayer1Score);
					System.out.println("Player 2's score: " + totalComputerScore);

						if (totalPlayer1Score < 100) {

						System.out.println("It is Player 2's turn."); //Tell the player that the computer goes first. 
						int player2Score = holdAt20(computerScore);
						//Makes a variable called player2Score that will store the return value for the computer holdAt20 method. 
					
						totalComputerScore += player2Score; 
						//Adds up the total score for the computer after each turn.

						System.out.println("Player 1's score: " + totalPlayer1Score);
						System.out.println("Player 2's score: " + totalComputerScore);
						}
					}

					if (firstPlayer == 2) {//If the random number generator generates 2, then the computer goes first. 
					
					System.out.println("It is Player 1's turn."); //Tell the player that the computer goes first. 
					int player2Score = holdAt20(computerScore);
					//Makes a variable called player2Score that will store the return value for the computer holdAt20 method. 
					
					totalComputerScore += player2Score; 
					//Adds up the total score for the computer after each turn.

					System.out.println("Player 1's score: " + totalComputerScore);
					System.out.println("Player 2's score: " + totalPlayer1Score);
					
						if (totalComputerScore < 100) {

						System.out.println("It is Player 2's turn."); 
						 
						int player1Score = holdUI();
						//Makes a variable called player1Score that will store the return value for the player input method.
					
						totalPlayer1Score += player1Score; 
						//Adds up the total score for the player after each turn.
					
						System.out.println("Player 1's score: " + totalComputerScore);
						System.out.println("Player 2's score: " + totalPlayer1Score);
						}
							
					}
				}
				
					if (totalPlayer1Score >= 100) {
					System.out.println("Game Over!!! " + playerName + " Wins! The score was " + totalPlayer1Score + "-" + totalComputerScore +".");
					//If player's score reaches 100, he/she wins. 
					return totalPlayer1Score;
				}	else {
					System.out.println("Game Over!!! The computer wins! The score was " + totalComputerScore + "-" + totalPlayer1Score + ".");
					//If computer's score reaches 100, it wins. 
					return totalComputerScore;
				}
				
				
				
				
		}
								
				
			
				
}



