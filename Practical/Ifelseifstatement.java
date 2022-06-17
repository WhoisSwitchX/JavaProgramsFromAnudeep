package SwitchX;

public class Ifelseifstatement {

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
