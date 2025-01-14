package programs;
import java.util.Scanner;
public class Four_digit_number_and_digit_sum {

	public static void main(String[] args) {
		
		int number,sum=0;
		
		System.out.println("Enter Four Digit Number:");
		Scanner Scan=new Scanner(System.in);
		number=Scan.nextInt();
		if(number>999&&number<=9999) {
			for(int i=1;i<=4;i++) {
				sum+=number%10;
				number=number/10;
			}
			System.out.println("Sum of Digits="+sum);
		}
		else {
			System.out.println("Not Four Digit Number.........Please Try Again");
		}
	}
}
