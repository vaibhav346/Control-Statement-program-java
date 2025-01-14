package Oct_01_10_Program;
import java.util.Scanner;
public class Armstrong_Number_check {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int num,Ori_num,sum=0,rem;
		System.out.print("Enter Number:");
		num=Scan.nextInt();
		
		Ori_num=num;
		while(Ori_num>0){
			
			rem=Ori_num%10;
			sum+=rem*rem*rem;
			Ori_num=Ori_num/10;
		}
		if(sum==num) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
		
		
	}
}
