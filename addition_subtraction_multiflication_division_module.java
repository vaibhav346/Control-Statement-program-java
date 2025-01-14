package programs;

public class addition_subtraction_multiflication_division_module {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inum1=50,inum2=20,result;
		
		result=inum1+inum2;
		System.out.println("Sum is="+result);
		
		result=inum1-inum2;
		System.out.println("Subtraction is="+result);
		
		result=inum1*inum2;
		System.out.println("multiflication is="+result);
		
		result=inum1/inum2;
		System.out.println("Division is="+result);
		
		result=inum1%inum2;
		System.out.println ("Module is="+result);
		
		inum1++;
		System.out.println("post increment="+inum1);
		
		++inum1;
		System.out.println("pre increment="+inum1);
		
		inum1--;
		System.out.println("post dcrement="+inum1);
		
		--inum1;
		System.out.println("pre increment="+inum1);
	}

}
