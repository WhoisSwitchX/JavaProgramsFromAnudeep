/*
 * @ Author Saurabh Mathe
 */

package SwitchX;

class Student{

	String name;
	String std;
	int rollNo;
	String div;
	double marks;
	char grade;

	public void getDetails() {

		System.out.println("Name: "+name);
		System.out.println("Standard: "+std);
		System.out.println("Roll No: "+rollNo);
		System.out.println("Division: "+div);
		System.out.println("Marks Secured= "+ marks + " Grade: " + grade);
	}
}
public class PVG {
	public static void main(String[] args) {
		
		System.out.println("Academic Topper of PVG'S College");
		System.out.println();

		Student Saurabh = new Student();
		Student Aniket = new Student();
		Student Pawan = new Student();
		Student Lahoo = new Student();
		Student Krishna = new Student();
		Student Anand = new Student();

		Saurabh.name = "Saurabh S. mathe.";
		Saurabh.std = "Ty BSc";
		Saurabh.rollNo = 120;
		Saurabh.div = "IT";
		Saurabh.marks = 97.00;
		Saurabh.grade = 'O';

		Aniket.name = "Aniket S. Wagh.";
		Aniket.std = "Ty BSc";
		Aniket.rollNo = 163;
		Aniket.div = "IT";
		Aniket.marks = 93.56d;
		Aniket.grade = 'A';

		Pawan.name = "Pawan S. Shinde";
		Pawan.std = "Ty BSc";
		Pawan.rollNo = 137;
		Pawan.div = "IT";
		Pawan.marks = 90.54d;
		Pawan.grade = 'A';
		
		Lahoo.name = "Lahoo P Chavan";
		Lahoo.std = "Ty BSc";
		Lahoo.rollNo = 167;
		Lahoo.div = "IT";
		Lahoo.marks = 92.00d;
		Lahoo.grade = 'A';

		Krishna.name = "Krishna N. Dahiphale";
		Krishna.std = "Ty BSc";
		Krishna.rollNo = 164;
		Krishna.div = "IT";
		Krishna.marks = 91.50d;
		Krishna.grade = 'A';

		Anand.name = "Anand V. Todarmal";
		Anand.std = "Ty BSc";
		Anand.rollNo = 101;
		Anand.div = "IT";
		Anand.marks = 89.90d;
		Anand.grade = 'A';

		Saurabh.getDetails();
		System.out.println();
		
		Aniket.getDetails();
		System.out.println();
		
		Pawan.getDetails();
		System.out.println();
		
		Lahoo.getDetails();
		System.out.println();
		
		Krishna.getDetails();
		System.out.println();
		
		Anand.getDetails();

	}

}

