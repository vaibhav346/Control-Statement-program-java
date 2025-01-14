package Sep_28_10_program;
import java.util.Scanner;
public class Swap_without_third_variable {

	public static void main(String[] args) {
		System.out.println("Enter Two number:");
		Scanner Scan=new Scanner(System.in);
		int inum1,inum2;
		
		inum1=Scan.nextInt();
		inum2=Scan.nextInt();
		System.out.println("Before Swap");
		System.out.println("num1:"+inum1);
		System.out.println("num2:"+inum2);
		
		inum1=inum1+inum2; //
		inum2=inum1-inum2;
		inum1=inum1-inum2;
		
		System.out.println("\nAfter Swap");
		System.out.println("num1:"+inum1);
		System.out.println("num2:"+inum2);
	}
}
