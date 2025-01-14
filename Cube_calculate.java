package programs;

import java.util.Scanner;
public class Cube_calculate {

	public static void main(String[] args) {
		
		int inum;
		
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter Integer number");
		
		inum=Scan.nextInt();
		
		inum=inum*inum*inum;
		System.out.println("Cube is="+inum);
		
	}
	
}
