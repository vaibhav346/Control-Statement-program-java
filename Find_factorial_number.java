package Sep_30_10_program;
import java.util.Scanner;
public class Find_factorial_number {
	
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int num,fac=1;
		System.out.println("Enter number: ");
		num=Scan.nextInt();
		for(int i=1;i<=num;i++) {
			
			fac=fac*i;
		}
		System.out.println("Factorial number is="+fac);
	}

}
