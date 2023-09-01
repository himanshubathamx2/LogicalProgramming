
public class NoOfDigitsInString
{

	public static void main(String[] args)
	{
		String s="gfgh164bvgdfg86";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			try {
			if(Integer.valueOf(""+s.charAt(i))>=0  || Integer.valueOf(""+s.charAt(i))<=9)
			{
				count++;
			}
			}catch(NumberFormatException e)
			{
				continue;
			}
		}
		System.out.println(count);
		
	}

}
