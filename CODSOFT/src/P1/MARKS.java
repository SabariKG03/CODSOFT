package P1;
import java.util.*;
public class MARKS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Total Number of Subjects: ");
		int total_subjects = sc.nextInt();
		int total_marks=0;
		for(int i=0;i<total_subjects;i++) {
			System.out.println("Enter the mark of the "+ "subject "+(i+1)+": ");
			int s = sc.nextInt();
	
			total_marks+=s;
		}
		System.out.println("Total marks you scored in "+total_subjects+" subjects are "+total_marks+".");
		double avg_per = total_marks/total_subjects;
		System.out.println("The average percentage in "+total_subjects+" subjects are "+avg_per);
		if(avg_per>=90) {
			System.out.println("The grade is O.");
		}
		else if(avg_per>=80&&avg_per<90) {
			System.out.println("The grade is A+.");
		}
		else if(avg_per>=70&&avg_per<80) {
			System.out.println("The grade is A.");
		}
		else if(avg_per>=65&&avg_per<70) {
			System.out.println("The grade is B+.");
		}
		else if(avg_per>=55&&avg_per<65) {
			System.out.println("The grade is B.");
		}
		else if(avg_per>=35&&avg_per<55){
			System.out.println("The grade is C.");
		}
		else {
			System.out.println("The grade is U.You ae Fail...");
		}
	}//hioofjgjoggj
}
