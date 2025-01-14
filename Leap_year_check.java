package programs;

import java.util.Scanner;

public class Leap_year_check {

	public static void main(String[] args) {
		
		
		
		int year,i=1;
		do {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter Year:");
		
		year=Scan.nextInt();
		
		
		 if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("Leap year\n");
		}
		else {
			System.out.println("Not Leap year\n");
		}
		}while(i!=5);
	}
}
