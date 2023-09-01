
public class Pattern8 {

	public static void main(String[] args)
	{
		int odd=1,x=1,mid;
		System.out.println(1);
		for(int i=1;i<=20;i++)
		{
			mid=(x+1)/2;
			for(int j=1;j<=mid;j++)
			{
				System.out.print(j);
			}
			for(int j=mid+1;j>=1;j--)
			{
				System.out.print(j);
			}
			x=x+2;
			System.out.println("");
		}
	}

}
