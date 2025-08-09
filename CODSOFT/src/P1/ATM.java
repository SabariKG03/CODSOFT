package P1;
import java.util.*;
public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BANK b = new BANK();
		System.out.println("Welcome to the ATM Interface:");
		System.out.println("Services:");
		System.out.println("For Deposit -- Enter 1");
		System.out.println("For Withdrawl -- Enter 2");
		System.out.println("For Check_balance -- Enter 3");
		System.out.println("For Exiting -- Enter 4");
		while(true) {
			System.out.println("Enter your option: ");
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println("Deposit Amount:");
			int amount =sc.nextInt();
			b.deposit(amount);
		}
		else if(choice==2) {
			System.out.println("Withdrawl Amount:");
			int amount =sc.nextInt();
			b.withdraw(amount);
		}
		else if(choice==3) {
			b.balancecheck();
		}
		else if(choice==4) {
			System.out.println("Exiting....");
			sc.close();
			return;
		}
		else {
			System.out.println("Invalid Option..Please try again..");
		}
	}
}}
