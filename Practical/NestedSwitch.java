package SwitchX;

public class NestedSwitch {

	public static void main(String[] args) {

		char branch = 'c';
		int year = 2;

		switch(year)
		{
		case 1: 
			System.out.println("English, Maths, Science");
			break;
		case 2: 
			switch(branch)
			{
			case 'c':
				System.out.println("C Programming");
				break;
			case 'e':
				System.out.println("Digital Electronics");
				break;
			case 'm':
				System.out.println("Mechanics");
				break;
			default:
				System.out.println("Invalid Stream");
			}
		case 3:
			switch(branch)
			{
			case 'c':
				System.out.println("C++ Programming");
				break;
			case 'e':
				System.out.println("Digital Architecture");
				break;
			case 'm':
				System.out.println("Statistics");
				break;

			}

		}
	}
}
