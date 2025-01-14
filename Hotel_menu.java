package programs;

import java.util.Scanner;
public class Hotel_menu {

	public static void main(String[] args) {
		int ch, sum = 0, bill = 0, Quantity;
		String Name;
		do {
			System.out.println("...........................................");
			System.out.println("  Shree Sai hotels Menu Card");
			System.out.println("\n      1.Tea\t10 Rup\n      2.Coffee\t20 Rup\n      3.Juice\t30 Rup\n      4.Exit");
			System.out.println("---------------------------------------------");
			System.out.println("     **Shree Sai Hotel Bill**\n");
			Scanner stringScanner=new Scanner(System.in);
			System.out.print("Your Name:");
			Name=stringScanner.next();
			
			Scanner Scan = new Scanner(System.in);

			
			
			System.out.println("\n\t"+Name);
			do {
				System.out.print("\n Choice Order Please:");
				ch = Scan.nextInt();
				
			switch (ch) {
			
			case 1:

				System.out.println("\n           **TEA**\n");
				System.out.print("Tea Quantity:");
				Quantity = Scan.nextInt();

				bill = Quantity * 10;
				sum=sum+bill;
				System.out.println("Tea Bill:" + bill);
				break;

			case 2:
				System.out.println("\n           **Coffee**\n");
				System.out.print("Coffee Quantity:");
				Quantity = Scan.nextInt();

				bill = Quantity * 20;
				sum=sum+bill;
				System.out.println("Coffee Bill: " + bill);
				break;

			case 3:
				System.out.println("\n           **juice**\n");
				System.out.print("juice Quantity:");
				Quantity = Scan.nextInt();

				bill = Quantity * 30;
				sum=sum+bill;
				System.out.println("juice Bill:"+bill);
				break;

			case 4:
				break;

			default:
				System.out.println("Not Avilable.........Please Order Menu Card Quantity");

			}
			
			}while(ch!=4);
			System.out.println("\nYour Total Bill is:"+sum);
			System.out.println("\n        !! Thank You !!");
		} while (ch != 0);
		

	}
}
