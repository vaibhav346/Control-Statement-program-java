package Sep_28_10_program;
import java.util.Scanner;
public class Buy_Price_Discount_precentage_for_user {

	public static void main(String[] args) {
		
		float buy_price,Discount_per;
		float one_per,discount_rup,total_discount;
		
		Scanner Scan=new Scanner(System.in);
		System.out.print("Enter Buy price:");
		buy_price=Scan.nextFloat();
		System.out.print("Enter Discount in percentage:");
		Discount_per=Scan.nextFloat();
		
		one_per=buy_price/100;            // price/100= 1% calculate 
		discount_rup=one_per*Discount_per; // 1%* discount percentage= 
		System.out.println("\nDiscount rupes:"+discount_rup);
		total_discount=buy_price-discount_rup; //buy price-discount rup=total discount
		System.out.println("Total disocunt:"+total_discount);
		
		
		
	}
}
