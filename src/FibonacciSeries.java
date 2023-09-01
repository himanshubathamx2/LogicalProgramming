
public class FibonacciSeries {

	public static void main(String[] args)
	{
		int x=0,y=1,sum=0,z=0;
		int n=10;// no. of digits
		System.out.print("0 1");
		while(n>=1)
		{
			z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;
			n--;
		}
		

	}

}
