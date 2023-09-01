
public class SwappingOfNumbers {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int tmp;
		
		tmp=a;
		a=b;
		b=tmp;
		System.out.println(a+" "+b);
		
		//Withouth 3rd
		int x=10,y=20;
		x=x+y;
		y=x-y;                             
		x=x-y;
		System.out.println(x+" "+y);
		
	

	}

}
