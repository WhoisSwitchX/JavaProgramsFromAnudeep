package SwitchX;

class Circle {

	float radius;

	Circle()
	{

		radius = 1.5f;
	}
	void Disp() 
	{
		System.out.println("Radius of the circle: " + radius);
	}
}

public class Shape {

	public static void main(String[] args) {

		Circle r = new Circle();
		r.Disp();

	}

}
