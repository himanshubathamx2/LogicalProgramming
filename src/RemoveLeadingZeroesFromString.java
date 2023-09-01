
public class RemoveLeadingZeroesFromString
{

	public static void main(String[] args)
	{
		String str="000000000gdgdshabc";
		int start=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!='0')
			{
				start=i;
				break;
			}
		}
		String s2=str.substring(start,str.length());
		System.out.println(s2);
	}

}
