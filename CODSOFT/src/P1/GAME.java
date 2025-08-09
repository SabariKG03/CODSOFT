package P1;
import java.util.*;
public class GAME {
	public static void main(String []args) {
		GAME g = new GAME();
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the Number ");
		g.Random();
		System.out.println("If u want to play again ?");
		String s = sc.nextLine();
		if(s.toLowerCase().equals("yes") ){
			System.out.println("Ok. We Continue the game ");
			System.out.println("Guess the Number ");
			g.Random();
		}
		else {
			System.out.println("Thank You!!");
		}
	}
	public static void Random() {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*101);
		int num_of_att=0,score=0,round=0;
		while(num_of_att<5) {
			int s =sc.nextInt();
			num_of_att++;
			if(s==random) {
				System.out.println("Fantastic!.You guessed the right answer");
				System.out.println("Number of attempts taken:"+num_of_att);
				score += 10;
				break;
			}
			else {
				if(s<random) {
				System.out.println("too low");
				}
			else{
				System.out.println("too high");
				}
			if(num_of_att==5) {
				System.out.println("You have attained your limit of attempts");
			}
		}
	}
	round++;
	System.out.println("User Score: "+score);
	System.out.println("Round Completed: "+round);
}}
