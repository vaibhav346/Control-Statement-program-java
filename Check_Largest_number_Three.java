package programs;
import java.util.Scanner;
public class Check_Largest_number_Three {

	public static void main(String[] args) {
		
		int inum1,inum2,inum3;
		System.out.println("Enter Three number\n");
		Scanner Scan=new Scanner(System.in);
		
		inum1=Scan.nextInt();
		inum2=Scan.nextInt();
		inum3=Scan.nextInt();
		
		if(inum1>inum2&&inum1>inum3) {
			System.out.println("largest number"+inum1);
			
		}
		else if(inum2>inum1&&inum2>inum3) {
			System.out.println("largest number"+inum2);
		}
		else if(inum3>inum1&&inum3>inum2) {
			System.out.println("Largest number"+inum3);
		}
		else if(inum1==inum2&&inum2==inum3) {
			System.out.println("equal all");
		}
	}
}

