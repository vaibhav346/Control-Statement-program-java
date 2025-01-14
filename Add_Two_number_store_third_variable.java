package Sep_28_10_program;
import java.util.Scanner;
public class Add_Two_number_store_third_variable {

	public static void main(String[] args) {
		System.out.println("Enter Two numbers:");
		int inum1,inum2,sum;
		
		Scanner Scan=new Scanner(System.in);
		inum1=Scan.nextInt();
		inum2=Scan.nextInt();
		
		sum=inum1+inum2;
		
		System.out.println("Addition is:"+sum);
	}
}
