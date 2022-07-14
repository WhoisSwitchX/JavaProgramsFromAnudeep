package LabDay;

import java.util.Scanner;

class Student{
	
	Scanner sc = new Scanner(System.in);
	private int id;
	private String name;
	private String gender;
	private String Standard;

	public void setid() {
		System.out.println("enter id");
		id = sc.nextInt();
	}

	public void setname() {
		System.out.println("enter name");
		name = sc.nextLine();
	}

	public void setgender() {
		System.out.println("enter gender");
		gender = sc.nextLine();
	}

	public void setstandard() {
		System.out.println("enter standard");
		Standard = sc.nextLine();
	}

	public int getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public String getgender() {
		return gender;
	}

	public String getstandard() {
		return Standard;
	}
}

public class StudentInformation {

	public static void main(String []args) {
		
		Student lc = new Student();
		Scanner sc = new Scanner(System.in);
		
		lc.setid();
		lc.setname();
		lc.setgender();
		lc.setstandard();
		
		//printing the values 
		System.out.println("Student id is      :"+lc.getid());
		System.out.println("Student name is    :"+lc.getname());
		System.out.println("Student gender is  :"+lc.getgender());	
		System.out.println("Student standard is:"+lc.getstandard());

	}

}