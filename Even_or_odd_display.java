package Sep_30_10_program;
import java.util.Scanner;
public class Even_or_odd_display {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int num;
		System.out.print("Enter Number: ");
		num=Scan.nextInt();
		
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
}
