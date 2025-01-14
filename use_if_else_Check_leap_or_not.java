package Oct_01_10_Program;
import java.util.Scanner;
public class use_if_else_Check_leap_or_not {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int year;
		System.out.print("Enter Year: ");
		
		year=Scan.nextInt();
		
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not leap year");
		}
	}
}
