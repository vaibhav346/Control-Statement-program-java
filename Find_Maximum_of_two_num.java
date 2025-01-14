package Sep_30_10_program;
import java.util.Scanner;
public class Find_Maximum_of_two_num {

	public static void main(String[] args) {
		
		Scanner Scan=new Scanner(System.in);
		
		int inum1,inum2;
		
		System.out.println("Enter Two number:");
		inum1=Scan.nextInt();
		inum2=Scan.nextInt();
		if(inum1>inum2) {
			System.out.println("inum1 is Max num");
		}
		else {
			System.out.println("inum2 is Max num");
		}
	}
}
