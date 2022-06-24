/*
 * @ Author Saurabh Mathe
 */

package SwitchX;

public class LargestNumber {

	public static void main(String args[]) {
		// Declaring the variable
		int a=25;
		int b=50;
		int c=75;
		int d=5;  
		//Applying if else
		if(a>b && a>c && a>d) 

			System.out.println("The Largest Number is "+a+".");
		else if (b> a && b>c && b>d)

			System.out.println("The Largest Number is "+b+".");

		else if(c>d && c>b && c>a)

			System.out.println("The Largest Number is "+c+".");

		else
			System.out.println("The Largest Number is "+d+".");

		//End of if else
	}

}
