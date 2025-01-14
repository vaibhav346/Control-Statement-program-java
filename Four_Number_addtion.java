package programs;
import java.util.Scanner;
public class Four_Number_addtion {

	public static void main(String[] args) {
		
		int inum1,inum2,inum3,inum4;
		System.out.println("Enter Four integer numbers:");
		Scanner Scan=new Scanner(System.in);
		
		inum1=Scan.nextInt();
		inum2=Scan.nextInt();
		inum3=Scan.nextInt();
		inum4=Scan.nextInt();
		
		inum1=inum1+inum2+inum3+inum4;
		System.out.println("Four number sum is="+inum1);
		
	}
	
}
