/*
 * @ Author Saurabh Mathe
 */
package SwitchX;
import java.util.Scanner;

public class UserInputForTwoMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows to print Matrix :");
		int rows = sc.nextInt();

		System.out.print("Enter number of columns to print Matrix :");
		int col = sc.nextInt();

		int arr[][] = new int[rows][col];
		for(int i = 0 ; i < arr.length ; i++) 
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				System.out.print("enter value for "+(i + 1)+ "st row and "+ (j+1) + "st coloumn : ");
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter number of rows for 2nd Matrix : ");
		int rows2 = sc.nextInt();
		System.out.print("Enter number of columns for 2nd Matrix : ");
		int col2 = sc.nextInt();

		int arr2[][] = new int[rows2][col2];
		for(int i = 0 ; i < arr2.length ; i++)
		{
			for(int j = 0 ; j < arr2[i].length ; j++) 
			{
				System.out.print("Enter value for "+(i + 1)+ "st Row and "+ (j+1) + "st Column  : ");
				arr2[i][j] = sc.nextInt();
			}
		}


		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++ )
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();


		for(int i = 0 ; i < arr2.length ; i++) 
		{
			for(int j = 0 ; j < arr2[i].length ; j++ )
			{
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
