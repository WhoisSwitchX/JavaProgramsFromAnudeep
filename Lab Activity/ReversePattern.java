/*
 * @ Author Saurabh Mathe
 */

package SwitchX;

public class ReversePattern {
	
	public static void main(String args[]) {
		//Declaring the variable
		int row = 5;
		//Using Nested for loop
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			//Printing the output
			System.out.println();

		}

	}
}
