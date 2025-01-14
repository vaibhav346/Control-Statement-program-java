package programs;
import java.util.Scanner;
public class Equal_9 {

	public static void main(String[] args) {
		
		int inum;
		
		System.out.println("Enter Integer number:");
		Scanner Scan=new Scanner(System.in);
		
		inum=Scan.nextInt();
		
		if(inum==9) {
			System.out.println("Equal to 9");
		}
		else {
			System.out.println("Not Equal");
		}
	}
}
