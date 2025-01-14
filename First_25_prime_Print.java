package Oct_01_10_Program;

public class First_25_prime_Print {

	public static void main(String[] args) {
	int num,cnt,i;
	for( num=1;num<=100;num++) {
		cnt=0;
		for( i=2;i<=num/2;i++) {
			if(num%i==0) {
				cnt++;
				break;
			}
		}
		if(cnt==0&&num!=0) {
			System.out.println(num);
		}
	}
		
	}
}
