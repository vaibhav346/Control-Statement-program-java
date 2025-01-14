package programs;
import java.util.Scanner;
public class Sum_of_digit {

	public static void main(String[] args) {
		
		int num,sum=0;
		
		System.out.println("Enter 3 digit number:");
		Scanner Scan=new Scanner(System.in);
		num=Scan.nextInt();
		
		if(num>0) {
			sum+=num%10;
			num=num/10;
			
		}
		if(num>0) {
			sum+=num%10;
			num=num/10;
			
		}
		if(num>0) {
			sum+=num%10;
			num=num/10;
		}
		System.out.println("Sum of digits is="+sum);
		
	}
}
