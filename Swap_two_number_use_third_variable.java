package programs;

public class Swap_two_number_use_third_variable {

	public static void main(String[] args) {
		
		int inum1=50;  //inum1=70
		int inum2=70;	//inum2=50
		int temp=0;
		
		System.out.println("BEFORE SWAP");
		System.out.println("inum1="+inum1);
		System.out.println("inum2="+inum2);
		
		//swap
		
		temp=inum1;
		inum1=inum2;
		inum2=temp;
		
		System.out.println();
		System.out.println("AFTER SWAP");
		System.out.println("inum1="+inum1);
		System.out.println("inum2="+inum2);
		
	}
}
