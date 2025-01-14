package programs;
import java.util.Scanner;

public class Check_even_number {
	
	public static void main(String[] args) {
		
		int inum;

	System.out.println("Enter integer number:");
	Scanner Scan=new Scanner(System.in);
	
	inum=Scan.nextInt();
	
	if(inum%2==0) {
		System.out.println("Even number");
	}
	else {
		System.out.println("Not Even number");
	}
	
	
	}
	
}
