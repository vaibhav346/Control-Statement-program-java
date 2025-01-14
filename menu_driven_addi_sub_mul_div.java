package Oct_01_10_Program;
import java.util.Scanner;
public class menu_driven_addi_sub_mul_div {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int ch,i=1;
		float num1,num2,result;
		do {
		System.out.print("\n1.addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit");
		
		System.out.print("\n\nEnter your Choice:");
		ch=Scan.nextInt();
		
		switch(ch) {
		
		case 1:
			System.out.println("Enter Two number:");
			num1=Scan.nextInt();
			num2=Scan.nextInt();
			
			result=num1+num2;
			System.out.println("Addition is="+result);
			break;
			
		case 2:
			System.out.println("Enter Two number:");
			num1=Scan.nextInt();
			num2=Scan.nextInt();
			
			result=num1-num2;
			System.out.println("Subtraction is="+result);
			break;
			
		case 3:
			System.out.println("Enter Two number:");
			num1=Scan.nextInt();
			num2=Scan.nextInt();
			
			result=num1*num2;
			System.out.println("Multiplication is="+result);
			break;
			
		case 4:
			System.out.println("Enter Two number:");
			num1=Scan.nextInt();
			num2=Scan.nextInt();
			
			result=num1/num2;
			System.out.println("Division is="+result);
			break;
			
			
		case 5:
			break;
			
			default:
				System.out.println("Wrong Choice..........Try again");
		}
			
		}while(ch!=5);

		
		
	}
}
