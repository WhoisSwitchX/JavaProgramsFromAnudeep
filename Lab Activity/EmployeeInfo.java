package LabDay;
class Employee{
	private int id;
	private String name;
	private String department;
	
	public Employee() {
		id = 15;
		name = "Saurabh s. mathe.";
		department = "TY BSc.IT";
	}
	
	public Employee(int myid, String myname) {
		id = myid;
		name = myname;
		department = "TY BSc.IT";
	}
	
	public Employee(int myid, String myname, String mydepartment) {
		id = myid;
		name = myname;
		department = mydepartment;
	}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public String getdepartment() {
		return department;
	}
}

public class EmployeeInfo {

	public static void main(String[] args) {
		
		Employee Saurabh = new Employee();
		Employee Pawan = new Employee(25,"Pawan S. Shinde");
		Employee Aniket = new Employee(10,"Aniket S, Wagh","TY BSc.IT");
		
		System.out.println(Saurabh.getname());
		System.out.println(Saurabh.getid());
		System.out.println(Saurabh.getdepartment());
		System.out.println();
		System.out.println(Pawan.getname());
		System.out.println(Pawan.getid());
		System.out.println(Pawan.getdepartment());
		System.out.println();
		System.out.println(Aniket.getname());
		System.out.println(Aniket.getid());
		System.out.println(Aniket.getdepartment());
		
		
	}

}
