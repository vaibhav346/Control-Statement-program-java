package Oct_01_10_Program;

public class Armstrong_print_0_to1000 {

	public static void main(String[] args) {
		
		int rem,Ori_num,Num,res=0;
		for(int i=1;i<=1000;i++) {
			Num=i;
			Ori_num=i;
			res=0;
			while(Num!=0) {
				
				rem=Num%10;
				res+=rem*rem*rem;
				Num=Num/10;
			}
			if(Ori_num==res) {
				System.out.println(Ori_num);
			}
			
		}
	}
}
