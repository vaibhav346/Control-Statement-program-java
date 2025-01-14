package Oct_01_10_Program;
import java.util.Scanner;
public class Find_maximum_three_number {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter Three number:");
		num1=Scan.nextInt();
		num2=Scan.nextInt();
		num3=Scan.nextInt();
		
		if(num1>num2&&num1>num3) {
			System.out.println("Maximum Number is:"+num1);
			
		}
		if(num2>num1&&num2>num3) {
			System.out.println("Maximum Number is:"+num2);
			
		}
		if(num3>num1&&num3>num2) {
			System.out.println("Maximum Number is:"+num3);
			
		}
		if(num1==num2&&num2==num3) {
			System.out.println("All Equal:");
			
		}
		
	}
}
