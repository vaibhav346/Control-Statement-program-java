package programs;
import java.util.Scanner;
public class Sum_of_One_to_10 {

	public static void main(String[] args) {
		System.out.println("Enter a number(Range):");
		int num,sum=0;
		Scanner Scan=new Scanner(System.in);
		num=Scan.nextInt();
		for(int i=0;i<=num;i++) {
			sum+=i;
		}
		System.out.println("Sum is="+sum);
	}
}
