package programs;
import java.util.Scanner;
public class Area_of_circle {

	public static void main(String[] args) {
	
	double radius,area;
	double py=3.14;
	System.out.println("Enter radius:");
	Scanner Scan=new Scanner(System.in);
	radius=Scan.nextFloat();
	area=py*radius*radius;
	
	System.out.println("Area of Circle:"+area);
	
}
}