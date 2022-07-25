package LabDay;
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissorGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ra = new Random();

		int pc_choice = ra.nextInt(3)+1;
		int no_choices = 0;
		int t_chances = 5;
		int C_point = 0;
		int P_point = 0;

		while (no_choices<t_chances){
			System.out.println("Enter Rock, Paper, Scissor as 1, 2, 3 respectively:");
			byte user_input = sc.nextByte();

			if(user_input==pc_choice){
				System.out.println("It is a Tie ");
			}

			else if (user_input<=3 && user_input>=1) {
				
				// Computer inputs 3
				
				if (user_input==1 && pc_choice==3){
					System.out.println("Congrats You Won!!");
					C_point = (int)C_point + 1;
					System.out.println("Your Score is " + P_point + " Computer score is " + C_point);
					System.out.println();
					System.out.println("You Entered " + user_input +" and the Bot choice was "+ pc_choice);
				}
				else if (user_input==2 && pc_choice==3){
					System.out.println("Alas you lost!!");
					P_point = (int)P_point + 1;
					System.out.println("Your Score is " + P_point + " Computer score is " + C_point);
					System.out.println();
					System.out.println("You Entered" + user_input +" and the Computer choice was "+ pc_choice);
				}
				// Computer inputs 2
				if (user_input==1 && pc_choice==2){
					System.out.println("Alas you lost!!");
					P_point = (int)P_point + 1;
					System.out.println("Your Score is " + P_point + " Computer score is " + C_point);
					System.out.println();
					System.out.println("You Entered " + user_input +" and the Computer choice was "+ pc_choice);
				}


				else if (user_input==3 && pc_choice==2){
					System.out.println("Congrats You Won!!");
					C_point = (int)C_point + 1;
					System.out.println("Your Score is " + P_point + " Computer score is " + C_point);
					System.out.println();
					System.out.println("You Entered " + user_input +" and the Computer choice was "+ pc_choice);
				}
				// Computer inputs 1
				else if (user_input==2 && pc_choice==1){
					System.out.println("Alas you lost!!");
					P_point = (int)P_point + 1;
					System.out.println("Your Score is " + P_point + " Computer score is " + C_point);
					System.out.println();
					System.out.println("You Entered " + user_input +"a nd the Computer choice was "+ pc_choice);
				}

				else if (user_input==3 && pc_choice==1){
					System.out.println("Congrats You Won!!");
					C_point = (int)C_point + 1;
					System.out.println("Your Score is " + P_point + " Computer score is " + C_point);
					System.out.println();
					System.out.println("You Entered " + user_input +" and the Computer choice was "+ pc_choice);
				}
			}
			else {
				System.out.println("Please Enter Right Input.");
			}
			no_choices ++;
			int left = t_chances - no_choices;
			System.out.println("You are left with only "+left+" chances");
		}
		System.out.println("Game Over");
		System.out.println("Scoreboard");
		if(C_point>P_point){
			System.out.println("You win the game");
			System.out.println("Your Final Score is " + P_point + " Computer Final score is " + C_point);
		}
		else if(C_point<P_point){
			System.out.println("You loss the game");
			System.out.println("Your Final Score is " + P_point + " Computer Final score is " + C_point);
		}
		else if(C_point==P_point){
			System.out.println("Tie");
			System.out.println("Your Final Score is " + P_point + " Computer Final score is " + C_point);
		}
		
		sc.close();
		
	}

}

