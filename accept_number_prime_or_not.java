package Sep_30_10_program;
import java.util.Scanner;
public class accept_number_prime_or_not {

	public static void main(String[] args) {
		
		Scanner Scan=new Scanner(System.in);
		int inum,cnt=0;
		
		System.out.println("Enter a Number:");
		inum=Scan.nextInt();
		
		for(int i=2;i<=inum/2;i++) {
			if(inum%i==0) {
				cnt++;
				break;
			}
		}
	
			if(cnt==0) {
				
				System.out.println("prime number");
		}
			else {
				System.out.println("Not prime number");
			}
	}
}
