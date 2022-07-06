/*
 * @ Author Saurabh Mathe
 */
package SwitchX;
import java.util.Scanner;

class TaxCalculator
{
	float basicSalary;
	boolean citizenShip;

	public float calculateTax () 
	{
		float tax = 30*basicSalary/100;
		return tax;	
	} 
}
public class TaxCalculate 
{
	public static void main(String []args) 
	{
		Scanner ab = new Scanner(System.in);
		TaxCalculator tc = new TaxCalculator();

		System.out.println("Enter the salary to calculate tax: ");
		tc.basicSalary = ab.nextFloat();

		System.out.println("The Tax of the employee for the  " + tc.basicSalary + " is "+ tc.calculateTax());

	}	

}
