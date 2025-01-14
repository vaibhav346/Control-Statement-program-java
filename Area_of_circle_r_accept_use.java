package Sep_30_10_program;
import java.util.Scanner;
public class Area_of_circle_r_accept_use {
	
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		float radius,area,pi=3.14f;
		
		System.out.print("Enter Radius:");
		radius=Scan.nextFloat();
		
		area=pi*radius*radius;
		System.out.println("Ara of Circle is="+area);
	}

}
