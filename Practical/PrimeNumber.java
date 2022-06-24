/*
 * @Author Saurabh Mathe
 */

package SwitchX;

public class PrimeNumber {

	public static void main(String[] args) {
		//Declaring Variable
		int counter = 0;
		int num = 11;
		//Entering in for loop
		for(int i = 2; i<=num/2;i++) 
		{
			if(num % i == 0) {
				counter = 1;
				break;
			} 
		}
		if(counter ==1)
			System.out.println(num+ " is not a prime number.");
		else
			System.out.println(num+ " is a prime number.");

	}

}
