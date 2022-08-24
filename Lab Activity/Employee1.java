package SwitchX;

public class Employee1 {

	long eId;
	String eName;
	String eAd;
	long ePh;
	double basicsalary;
	double specialAllowance;
	double hra;

	Employee1(){
		specialAllowance=230.80;
		hra=1000.50;
	}

	Employee1(long eId ,String eName ,String eAd,long ePh,double basicsalary){
		this.eId=eId;
		this.eName=eName;
		this.eAd=eAd;
		this.ePh=ePh;
		this.basicsalary=basicsalary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("<---------------details for Manager------------------>");

		Manager mg= new Manager(126564,"peter","chennai india",4726473,65000);
		System.out.println();
		System.out.println("details of Manager:---");
		System.out.println("ID:--"+" "+ mg.eId+" "+ "Name:--"+" "+ mg.eName +" "+ "Address:--"+" "+ mg.eAd+" "+"phoneNumber:--"+" "+mg.ePh+" "+"basicsalary"+" "+mg.basicsalary);
		System.out.println();
		System.out.println("total salary of Manager:- ");
		mg.cSalary(65000,230.80,1000.50);
		System.out.println();
		System.out.println("TravelingAllowance for Manager:-");
		mg.TrAllowance(65000);
		System.out.println();
		System.out.println("<---------------details for Trainee------------------>");

		Trainee tr =new Trainee(29846,"jack","mumbai india",442085,4500);
		System.out.println();
		System.out.println("details of Trainee:---");
		System.out.println("ID:--"+""+tr.eId+" "+"Name:--"+" "+tr.eName+" "+"Address:--"+" "+ tr.eAd+" "+"phoneNumber:--"+" "+tr.ePh+" "+"basicsalary"+" "+tr.basicsalary);
		System.out.println();
		System.out.println("total salary of trainee:- ");
		tr.calculateSalary(45000,230.80,1000.50);
		System.out.println();
		System.out.println("TravelingAllowance for Trainee:-");
		tr.TrAllowance(45000);
	}

}
class Manager extends Employee1 {
	Manager(long eId ,String eName ,String eAd,long ePh,double basicsalary){
		this.eId=eId;
		this.eName=eName;	
		this.eAd=eAd;	
		this.ePh=ePh;	
		this.basicsalary=basicsalary;	

	}
	public static void cSalary(double basicsalary,double specialAllowance,double hra) {

		double salary = basicsalary + (basicsalary * specialAllowance/100) + basicsalary * hra/100;
		System.out.println(salary);
	}
	public static void TrAllowance(double basicsalary) {
		double trallowance=15*basicsalary/100;
		System.out.println(trallowance);
	}
}
class Trainee extends Employee1{
	Trainee(long eId ,String eName ,String eAd,long ePh,double basicsalary) {		
		this.eId=eId;
		this.eName=eName;
		this.eAd=eAd;
		this.ePh=ePh;
		this.basicsalary=basicsalary;

	}
	public static void calculateSalary(double basicsalary,double specialAllowance,double hra) {

		double salary = basicsalary + (basicsalary * specialAllowance/100) + basicsalary * hra/100;
		System.out.println(salary);
	}
	public static void TrAllowance(double basicsalary) {
		double trallowance=15*basicsalary/100;
		System.out.println(trallowance);

	}

}
