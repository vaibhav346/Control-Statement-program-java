package programs;

public class Swap_two_number_no_third_variable {

	public static void main(String[] args) {
		
		//Swap without Third variable
		
		int inum1=70; //inum1=20
		int inum2=20;	//inum2=70
		
		System.out.println("BEFORE SWAP");
		System.out.println("inum1="+inum1);
		System.out.println("inum2="+inum2);
		
		// Swap variables
		// using addition and subtraction
		
		inum1=inum1+inum2; // 70+20=90 inum1=90
		inum2=inum1-inum2; // 90-20=70 inum2=70
		inum1=inum1-inum2; // 90-70=20 inum1=20
		
		System.out.println();
		System.out.println("AFTER SWAP");
		System.out.println("inum1="+inum1);
		System.out.println("inum2="+inum2);
	}
}
