/*
 * @ Author Saurabh Mathe
 */

package SwitchX;

public class LargestNumber {

	public static void main(String[] args) {
		//Declaring variable
		int n1 =25, n2 =45, n3 =75, n4 =50;
		//Using Nested ifelse
		if(n1 > n2 & n1> n3 & n1 > n4 ) {
			System.out.println(" The Largest Number is "+n1+".");
		}
		else if (n2 > n1 & n2> n3 & n2 > n4) 
		{
			System.out.println(" The Largest Number is "+n2+".");
		}
		else if (n3 > n1 & n3> n2 & n3 > n4) {
			System.out.println(" The Largest Number is "+n3+".");
		}
		else {
			System.out.println(" The Largest Number is "+n4+".");
		}

	}

}
