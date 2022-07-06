/*
 * @ Author Saurabh Mathe
 */
package SwitchX;
import java.util.Scanner;
public class KidsLaptopManufacturer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from 1 to 4: ");
		int num = sc.nextInt();
		int num1 ;
		int num2;

		switch (num) {

		case 1 :System.out.println("Enter two number to Add ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int Add = num1 + num2;
		System.out.println("Addition of Two Number is  "+ Add);
		break;

		case 2 :System.out.println("Enter two number to be Subtract ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int Subtract = num1-num2;
		System.out.println("Subtraction of Two Numbers is "+Subtract);
		break;

		case 3 :System.out.println("Enter two number to Multiply ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int Multiply = num1*num2;
		System.out.println("T multiplication of Two Numbers is s "+ Multiply);
		break;

		case 4 :System.out.println("Quit");
		break;

		default : System.out.println("Please enter valid Number");
		System.out.println("Thank you!!");
		}
	}

}


