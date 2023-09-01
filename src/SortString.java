import java.util.Arrays;

public class SortString
{

	public static void main(String[] args)
	{
		//sorting string using Arrays class
		String s="ghdshdsggfs";
		char[] c=s.toCharArray();
		Arrays.sort(c);
	//	System.out.println(c);
		
		//manually sort string
		String str="ghdshdsggfs";
		char[] c1=str.toCharArray();
		char tmp=0;
		for(int i=0;i<c1.length;i++)
		{
			for(int j=i+1;j<c1.length;j++)
			{
				if(c1[i]>c1[j])
				{
					tmp=c1[i];
					c1[i]=c1[j];
					c1[j]=tmp;
				}
			}
		}
		for(int i=0;i<c1.length;i++)
		{
			System.out.print(c1[i]);
		}

	}

}
