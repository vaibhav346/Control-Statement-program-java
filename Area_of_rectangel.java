package programs;
import java.util.Scanner;
public class Area_of_rectangel {

	public static void main(String[] args) {
		System.out.println("Enter Width & length:");
		float width,length,area;
		Scanner Scan=new Scanner(System.in);
		width=Scan.nextFloat();
		length=Scan.nextFloat();
		
		area=width*length;
		System.out.println("Area of Rectangle is="+area+ " Sq feet");
	}
}
