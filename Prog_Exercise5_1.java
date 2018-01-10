/**Program:Prog_Exercise5_1
 * File:Prog_Exercise5_1.java
 * Summary:Stores user inputed text into an array
 * Author:Lorenzo Quintana
 * Date:Dec 27, 2017
 */

import java.util.Scanner;
public class Prog_Exercise5_1 {
	public static void main (String[]args) {
	
		Scanner input = new Scanner(System.in);
		/**An array of 20 columns and 45 rows is created.*/
		char [][] matrix = new char [20][45];
		int column = 0;
		int i = 0;
		System.out.println("Please enter a selection of phrases, or words.  Press enter when complete: ");
		String userInput = input.nextLine();
		
		for (int row = 0; row < matrix[0].length;) {
			matrix[column][row] = userInput.charAt(i);
			row++;
			i++;
			for (int rowLength = 45; rowLength == row;) {
				matrix[column][row] = userInput.charAt(i);
				column++;
				i++;
				row = 0;
		for (int total = 900; userInput.length() < total;)	{
			matrix[column][row] = '@';
			
				}
			}
		}
		System.out.println(matrix);
		return;
	}
}