/*
 * @ Author Saurabh Mathe
 */
package SwitchX;
import java.util.Scanner;
class Area{
	
	int length;
	int breadth;
	int areaRectangle;
	
	public void calculateArea() {
				
		
		System.out.println("Area of Rectangle: " + length*breadth);
	}

}

public class AreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Area rectangle = new Area();
		System.out.println("Enter the value of Length");
		rectangle.length = sc.nextInt();
		System.out.println("Enter the value of Breadth");
		rectangle.breadth = sc.nextInt();
		
		rectangle.calculateArea();
		
	}

}
