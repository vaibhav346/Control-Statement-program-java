package Sep_28_10_program;

import java.util.Scanner;

public class calculate_net_salary_HRA_DA_PF {

	public static void main(String[] args) {
		System.out.println("Basic Salary:");

		float basic, Gross_salary, one_per, hra, pf;
		
		int HRA = 20, DA = 40, PF = 10;
		
		Scanner Scan = new Scanner(System.in);
		basic = Scan.nextInt();
		one_per = basic / 100; // 5000/100=50
		System.out.println("One percentage:" + one_per);
		
		hra = one_per * HRA; // 50*20=1000
		System.out.println("hra:" + hra);
		
		pf = one_per * PF; // 50*10=500
		System.out.println("pf:" + pf);
		
		float da = one_per * DA; // 50*40=2000
		System.out.println("da:" + da);
		
		Gross_salary = basic + hra + da;
		System.out.println("Gross Salaray=" + Gross_salary);

		float Net_Salary = Gross_salary - pf;
		System.out.println("Net Salary is=" + Net_Salary);

	}
}
