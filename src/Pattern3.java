
public class Pattern3 {

	public static void main(String[] args) 
	{
		
		char c1='A';
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(" "+c1++);
			}
			c1='A';
			System.out.println();
		}

	}

}
