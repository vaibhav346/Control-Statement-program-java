package Sep_30_10_program;

public class sum_of_1_to_20_even {

	public static void main(String[] args) {
		
		int num=20,sum=0;
		
		for(int i=1;i<num;i++) {
			
		if(i%2==0) {
			sum+=i;
		}
			
			
			
		}
		System.out.println("Sum of 1 to 20 Even numbers: "+sum);
	}
}
