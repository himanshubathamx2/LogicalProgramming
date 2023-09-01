
public class CheckStringIsOnlyWhitespaceOrNot
{

	public static void main(String[] args)
	{
		String str="			";
//		str=str.trim();
		if(str.length()==0)		//isEmpty() can also be used
		{
			System.out.println("String is only whitespaces");
		}
		else
		{
			System.out.println("Contains something");
		}
		
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
	}

}
