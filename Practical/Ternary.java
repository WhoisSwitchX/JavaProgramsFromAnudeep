package SwitchX;

public class Ternary {

	public static void main(String[] args) {
	
			 int a = 20;
			 int b = 15;
			 int c = 5;
			 int highest;
			 
			 highest = (a>b)? (a>c? a:c):(b>c? b:c);
			 System.out.println(highest);
			}

}
