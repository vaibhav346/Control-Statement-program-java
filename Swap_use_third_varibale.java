package Sep_28_10_program;

public class Swap_use_third_varibale {

	public static void main(String[] args) {
		
		int num1=50; //num1=79
		int num2=79; //num2=50
		int tem;
		
		System.out.println("Before Swap:");
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		tem=num1;  //tem=50
		num1=num2;  //num1=79
		num2=tem;  //num2=50
		
		System.out.println("\nAfter Swap:");
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}
}
