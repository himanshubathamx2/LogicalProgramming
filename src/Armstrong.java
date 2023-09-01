
public class Armstrong {

	public static void main(String[] args) 
	{
		int no=370,d;
		int n=370;
		int sum=0;
		
		while(n!=0)
		{
			d=n%10;
			sum=sum+d*d*d;
			n=n/10;
		}
		System.out.println(sum);
		if(sum==no)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not armstrong");
		}
		
	
	}

}
