/*Name: Yibo Wang
Emory ID: ywan738
Email: yibo.wang@emory.edu
Section #:006
Collaboration Statement: I used the Think @ Java textbook, collaborated with TA Dorothy and Rocky(Zhangyi) Ye, and referenced this Piazza question: https://piazza.com/class/idsvsq42pe42a?cid=305. */

import java.util.Scanner;
import java.io.*;


public class HW5 {

	public static void main(String[] args) throws IOException {
	
	int[][] board = new int[9][9];
	//Creates a 9*9 board to fill up values from the sudoku.txt file

	boardFromFile(board, args[0]);	

	
	System.out.println(isValidBoard(board));
	
	}
	
	public static void boardFromFile(int[][] grid, String fileName) throws IOException {

	File sudoku = new File("sudoku.txt");
	//Creates a new file for the sudoku.txt file. 

	Scanner in = new Scanner(sudoku);
	//Creates a scanner to scan the sudoku file. 
	
	for (int a = 0; a < grid.length; a++) {
		
			for (int b = 0; b < grid[a].length; b++) {
				grid[a][b] = Integer.parseInt(in.next()); 
				//Creates and reads the sukodu file into a 2D array 
				
				System.out.print(grid[a][b] + " "); 
				//This prints out each row of the sudoku board. The space after each number is just to make it look better. 		
			}
			System.out.println("");
			//This system.out.print just makes each row into a new line. 
	
		}
	}
			
	
	public static boolean isValidRow(int[][] grid, int row) {

		boolean[] validRow = new boolean [10];	

			for (int a = 0; a < 9; a++) {
				validRow[grid[row-1][a]] = true;		
			}
			//This creates a boolean array that correlates the number in the sodoku chosen row to the index number in the boolean array. The row-1 is because arrays starts at 0. 
						
			for (int b = 1; b < 10; b++) {
				if (validRow[b] == false)
				return false;
				//If any of the elements in the boolean array is false, then the row is not valid. 
		
			
			}
		

		return true;
		//If all the elements in the boolean array is true, then the row is valid. 
		
	} 



	public static boolean isValidColumn(int[][] grid, int col) {

		//I wrote this isValidColumnmethod similar to the isValidRow method.

		boolean[] validColumn = new boolean[10];
	
		for (int a = 0; a < 9; a++) {
			validColumn[grid[a][col-1]] = true;
				 
		//This creates a boolean array that coorelates the number in the sudoku column to the number in the boolean array.  The col-1 is because arrays starts at 0.

		}

		for (int b = 1; b < 10; b++) {
			if (validColumn[b] == false){
			return false;
			//If any of the elements in the boolean array is false, then the row is not valid. 
					
			//If all the elements in the boolean array is true, then the row is valid. 
			}
		}
		return true; 
		//This last return statement is just to make sure the isValidColumn method returns a boolean value. 
	} 
		
	public static boolean isValidSubBoard(int[][] grid, int subBoard) {
	
		/* Here are the starting points on the sudoku array, based on the subBoard #:
		 * 1 = grid[0][0] , 4 = grid[3][0] , 7 = grid[6][0] 
		 * 2 = grid[0][3] , 5 = grid[3][3] , 8 = grid[6][3]
		 * 3 = grid[0][6] , 6 = grid[3][6] , 9 = grid[6][6]
		 */
	
		//There are if statements to assign the starting point of the row and column number based on the subBoard number:
		
		int row = 0; //This represents the row number for the starting point of the 3x3 array.
		int col= 0; //This represents the columns number for the starting point of the 3x3 array. 
	
				if( subBoard == 1){ //If the first subBoard is chosen, the array starts at board[0][0]. 
					row = 0;
					col = 0;
				}
				if( subBoard == 2){
					row = 0;
					col = 3;
				}
				if( subBoard == 3){
					row = 0;
					col = 6;
				}
				if( subBoard == 4){
					row = 3;
					col = 0;
				}
				if( subBoard == 5){
					row = 3;
					col = 3;
				}
				if( subBoard == 6){
					row = 3;
					col = 6;
				}
				if( subBoard == 7){
					row = 6;
					col = 0;
				}
				if( subBoard == 8){
					row = 6;
					col = 3;
				}
				if( subBoard == 9){
					row = 6;
					col = 6;
				}
		
				else if (subBoard < 1 || subBoard > 9){//The subBoard can only be from 1 to 9. 
				return false;
				}
				
				int[][] subBoardArray = new int[3][3]; 
				//Creates a new 3x3 array that will fill up with all the numbers of that sudoku subboard. 
				
				boolean[] validSubBoard = new boolean[10];
				//Creates a boolean array that will correlate to the number in the sudoku subboard and change to true. 
				
				for(int i =0; i < 3;i++ ) {
					
					for (int j = 0; j <3; j++) {
						
						subBoardArray[i][j] = grid[row + i][col + j]; 
						//Matches the right value of the board array with the subBoard array.
						
						validSubBoard[subBoardArray[i][j]] = true; 
						// Matches the number in the sudoku subboard to the index number in the boolean array and then changes that index to true. 
						
						for (int b = 1; b < 10; b++ ) {
						
							if (validSubBoard[b] == false){
								return false;
								/*This method to verify if the subBoard is valid is the same method used in the isValidRow & isValidColumn. 
								 * If any of the elements in the boolean array index from 1-9 are false, the subBoard isn't valid. Otherwise it is true.  
								 */
							}
						
						
						}
					}
				
				}
			
			return true; //If all the numbers are valid, the subboard is true. 
						
			
	}
	

		public static boolean isValidBoard(int[][] grid) {
			
			for(int a = 1; a<10; a++) {
				if ((isValidRow(grid,a) == false) || (isValidColumn(grid, a) == false) || (isValidSubBoard(grid, a) == false)) {
					//If any of the methods are false, the entire sudoku board is invalid. Otherwise return true. 
					return false;
				}
				
			}
			
					
		return true;
		
		}

}

