package Oct_01_10_Program;
import java.util.Scanner;
public class Check_leap_year_or_not_use_ternary_operator {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int year;
		
		System.out.print("Enter Year:");
		year=Scan.nextInt();
		
	String Year=year%4==0 && year%100!=0 || year%400==0 ?"Leap year" :"Not leap year";
	 
	 System.out.println(Year);
	}
}
