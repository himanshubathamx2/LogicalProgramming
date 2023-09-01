
public class Pattern7 {

	public static void main(String[] args) 
	{
		int n;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{  
				if(j%2==0)n=0;else n=1;
				System.out.print(" "+n);
			}
			System.out.println();
		}

	}

}
