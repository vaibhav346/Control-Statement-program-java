package Oct_02_10_program;

public class Print_one_to_100_prime {

	public static void main(String[] args) {
		int num;
		int i=2;
		
		for(num=1;num<=10;num++) {
			
			for(i=2;i<num;i++) {
				if(num%i==0) {

				break;
					
				}
			}
			if(i==num&&num!=0)
			System.out.println(num);
		}
		
	}
}
