/*
 * @ Author Saurabh Mathe
 */

package SwitchX;

class Employee{
	
	int id;
	String name;
	String post;
	int salary;
	
	public void getDetails() {
		
		System.out.println("ID: " + id);
		System.out.println("The name is " + name);	
		System.out.println("Post: " + post);
		System.out.println("Salary: " + salary);
	}
}

public class CustomClass {

	public static void main(String[] args) {
		
		// Classname Objectname = new Classname ();
		
		System.out.println("Employee Information");
		System.out.println();
		
		Employee Saurabh = new Employee();
		Employee Aniket = new Employee();
		Employee Lahoo = new Employee();

		Saurabh.id = 19126;
		Saurabh.name = "Saurabh Mathe.";
		Saurabh.post = "Web Developer";
		Saurabh.salary = 90000;

		Aniket.id = 19127;
		Aniket.name = "Aniket Wagh.";
		Aniket.post = "System Engineer";
		Aniket.salary = 65000;		

		Lahoo.id = 19128;
		Lahoo.name = "Lahoo Chavan.";
		Lahoo.post = "Product Manager";
		Lahoo.salary = 80000;
				
	
		
		Saurabh.getDetails();
		System.out.println();
		Aniket.getDetails();
		System.out.println();
		Lahoo.getDetails();
		
	}

}
