package programs;

import java.util.Scanner;
public class eligible_vote_or_not {

	public static void main(String[] args) {
		
		int Age;
		System.out.println("Enter Age:");
		Scanner Scan=new Scanner(System.in);
		
		Age=Scan.nextInt();
		
		if(18<=Age) {
			
			System.out.println("Eligible by vote");
		}
		else {
			System.out.println("Not Eligible Vote");
		}
	}
}
