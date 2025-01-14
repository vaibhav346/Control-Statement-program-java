package Sep_30_10_program;
import java.util.Scanner;
public class positive_or_negative_accept_user {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		
		int num;
		
		System.out.print("Enter number: ");
		num=Scan.nextInt();
		
		if(num<0) {
			System.out.println("Negative Number");
		}
		
		else 
		{
			System.out.println("Positive Number");
		}
		
	}
}
