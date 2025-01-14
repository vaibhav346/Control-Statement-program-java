package Sep_30_10_program;
import java.util.Scanner;
public class Issue_Not_Issue_license {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int age;
		System.out.print("Enter Age: ");
		age=Scan.nextInt();
		
		if(age>=18) {
			System.out.println("Issue license");
		}
		else
		{
			System.out.println("No Issue license");
		}
		
	}
}
