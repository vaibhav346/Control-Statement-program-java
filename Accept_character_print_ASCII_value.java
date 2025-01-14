package Sep_28_10_program;
import java.util.Scanner;
public class Accept_character_print_ASCII_value {

	public static void main(String[] args) {
		System.out.println("Enter charter:");
		char ch;
		Scanner Scan=new Scanner(System.in);
		ch=Scan.next().charAt(0);
		
		int value=ch;
		System.out.println("Print ASCII Value:"+value);
		
	}
}
