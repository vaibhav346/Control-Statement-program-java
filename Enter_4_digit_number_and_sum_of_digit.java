package Sep_28_10_program;
import java.util.Scanner;
public class Enter_4_digit_number_and_sum_of_digit {

	public static void main(String[] args) {
		
		System.out.println("Enter Four Digit Number:");
		int num,sum=0;
		Scanner Scan=new Scanner(System.in);
		
		num=Scan.nextInt();
		
		if(num>999&&num<9999) {
			
			System.out.println("Four Digit Number:"+num);
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
			 if(num>0) {
				 sum+=num%10;
				 num=num/10;
			 }
			 System.out.println("Sum of Four Digit Number:"+sum);
		}
		else {
			System.out.println("Not Four Digit number..........Plese Enter Four Digit number");
		}
		
	}
}
