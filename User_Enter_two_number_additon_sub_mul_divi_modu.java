package programs;

import java.util.Scanner;

public class User_Enter_two_number_additon_sub_mul_divi_modu {
	
	public static void main(String[] args) {
		int inum1,inum2,result;
		
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter two number");
		
		inum1=Scan.nextInt();
		inum2=Scan.nextInt();
		
		result=inum1+inum2;
		System.out.println("Sum is="+result);
		
		result=inum1-inum2;
		System.out.println("Sub is="+result);
		
		result=inum1*inum2;
		System.out.println("Mul is="+result);
		
		result=inum1/inum2;
		System.out.println("division is="+result);
		
		inum1++;
		System.out.println("post increment="+inum1);
		
		++inum1;
		System.out.println("pre increment="+inum1);
		
		inum1--;
		System.out.println("post decrement="+inum1);
		
		--inum1;
		System.out.println("pre decrement="+inum1);
		
		
	}

}
