package programs;
import java.util.Scanner;
public class profit_loss_Check_program {

	public static void main(String[] args) {
		
		float buy_price,sell_price,res;
		Scanner Scan=new Scanner(System.in);
		 System.out.println("Enter Buy Price:");
		 buy_price=Scan.nextFloat();
		 System.out.println("Enter Sell Price");
		 sell_price=Scan.nextFloat();
		 
		 res=buy_price-sell_price;
//		 System.out.println("Reselt is="+res);
		 if(res<0) {
			 System.out.println("profit is="+res);
		 }
		 else {
			 System.out.println("loss is="+res);
		 }
		 
		
}
}