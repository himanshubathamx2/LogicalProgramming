

public class A3B2C {

	public static void main(String[] args)
	{
		String str="aaabbcccdd",tmp="";
		int count=0;
		for(int i=0;i<str.length();)
		{
			char c1=str.charAt(i);
			for(int j=0;j<str.length();j++)
			{
				if(c1==str.charAt(j))
				{
					count++;
				}
			}
			tmp=tmp+c1+count;
			i=i+count;
			count=0;
		}
		System.out.println(tmp);
	}

}
