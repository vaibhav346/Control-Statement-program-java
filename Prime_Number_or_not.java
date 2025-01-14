package Oct_01_10_Program;
import java.util.Scanner;
public class Prime_Number_or_not {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int num,cnt;
		System.out.print("Enter Number:");
		num=Scan.nextInt();
		cnt=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				cnt++;
				break;
		
		}
		}
		if(cnt>0) {
			System.out.println("Nor Prime number:");
		}
		else {
			System.out.println("Prime Nubmer:");
		}
	}
}
