package Sep_28_10_program;
import java.util.Scanner;
public class accept_five_subject_mark_calculate_percentage {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Five Subject Mark:");
		Scanner Scan=new Scanner(System.in);
		
		float s1,s2,s3,s4,s5;
		float sum=0,per;
		
		s1=Scan.nextFloat();
		s2=Scan.nextFloat();
		s3=Scan.nextFloat();
		s4=Scan.nextFloat();
		s5=Scan.nextFloat();
		
		sum=s1+s2+s3+s4+s5;  // total Marks Addition 
		System.out.println("Addition is="+sum);
		
		per=sum/5; //total addition divide total number of subject
		
		System.out.println("Percentage is="+per+"%");
	}

}
