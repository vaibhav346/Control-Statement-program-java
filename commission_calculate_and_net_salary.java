package Oct_01_10_Program;
import java.util.Scanner;
public class commission_calculate_and_net_salary {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		float basic_salary,Total_sales,Total_salary,com;
		System.out.print("Enter basic salary: ");
		basic_salary=Scan.nextFloat();
		System.out.print("Enter total Sales:");
		Total_sales=Scan.nextFloat();
		
		if(Total_sales>=5000&&Total_sales<=7500) {
			com=3;
			Total_salary=(Total_sales*com)/100+basic_salary;
			System.out.println("Total Salary:"+Total_salary);
		}
		if(Total_sales>=7501&&Total_sales<=10500) {
			com=8;
			Total_salary=(Total_sales*com)/100+basic_salary;
			System.out.println("Total Salary:"+Total_salary);
		}
		if(Total_sales>=10501&&Total_sales<=15000) {
			com=11;
			Total_salary=(Total_sales*com)/100+basic_salary;
			System.out.println("Total Salary:"+Total_salary);
		}
		if(Total_sales>=15000) {
			com=15;
			Total_salary=(Total_sales*com)/100+basic_salary;
			System.out.println("Total Salary:"+Total_salary);
		}
	}
}
