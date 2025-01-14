package Sep_30_10_program;
import java.util.Scanner;
public class Four_digit_sum {

	public static void main(String[] args) {
		
		Scanner Scan=new Scanner(System.in);
		int num,sum=0;
		System.out.print("Enter Four digit number:");
		num=Scan.nextInt();
		for(int i=1;i<=4;i++) {
			sum+=num%10;
			num=num/10;
		}
		System.out.println("Four digit sum is="+sum);
		
	}
}
