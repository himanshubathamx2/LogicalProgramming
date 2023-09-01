
public class PrimeOrNot {

	public static void main(String[] args)
	{
		int n=5;
		int i=1,count=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		
		if(count==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not a prime");
		}
		

	}

}
