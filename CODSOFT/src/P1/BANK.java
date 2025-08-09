package P1;
import java.util.*;

public class BANK {
	double balance;
	public void balance(double balance){
		this.balance = balance;
	}
	public void deposit (double amount){
		balance+=amount;
		System.out.println("Rs."+amount+" was deposited in your account.");
	}
	public void withdraw (double amount){
		if(amount>balance) {
			System.out.println("Insufficient balance");
			System.out.println("You has a available  balance of Rs."+balance);
		}
		else {
			balance-=amount;
			System.out.println("Withdrawn: Rs."+amount);
			System.out.println("After withdrawl amount you has a balance of Rs."+balance);
		}
	}
	public void balancecheck() {
		System.out.println("Available Balance: Rs."+balance);
	}
}
