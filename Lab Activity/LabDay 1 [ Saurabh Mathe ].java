Answers for Thursday Lab(16th June 2022)

Name : Saurabh S. Mathe.





1. Write a Java Program to check given number is even or odd.

// If Statement


public class ifstatement {

	public static void main(String[] args) {
		int n = 10;
		if (n % 2 == 0) {
			System.out.println("The number is even : "+ n);
		 } else {
			System.out.println("The number is odd : "+ n);
		 }
	}

}





2. Write a Java Program to print greatest of three numbers 
using if else.

// If else Statement


public class ifelse {

	public static void main(String[] args) {
		
		        int x = 10,  y= 35, z= 29;

		        if( x >= y & x>= z)
		            System.out.println(x + " is the largest number.");

		        else if (y >=x  & y >= z)
		            System.out.println(y + " is the largest number.");

		        else
		            System.out.println(z + " is the largest number.");
	}

}





3. Write a Java Program to print the life period of the 
user based on user's age.

// If else if Statement


public class ifelseifEx {

	public static void main(String[] args) {
		int a=26;
		if (a>=1 && a<=10)
		{
			System.out.println("Childhood");
		}
		else if (a>=10 && a<=16)
		{
			System.out.println("Adolescence");
		}
		else if (a>=16 && a<=19)
		{
			System.out.println("Teenager");
		}
		else if (a>=19 && a<=24)
		{
			System.out.println("Young Adult");
		}
		else if (a>=24 && a<=35)
		{
			System.out.println("Adult");
		}
		else if (a>=35 && a<=45)
		{
			System.out.println("Middle Age");
		}
		else if (a>=45 && a<=60)
		{
			System.out.println("Late Adult");
		}
		else
		{
		System.out.println("Senior Citizen");
		}
	}

}





4. Write a program to encrypt a grade by adding 8 to it. Also
decrpyt it to show the corrent grade.

// Type casting


public class typecastings {

	public static void main(String[] args) {
		char a = 'b';
			// Encrypt
		a = (char) (a+8);
		System.out.println(a);

			// Decrypt
		a = (char)(a-8);
		System.out.println(a);
	}

}
