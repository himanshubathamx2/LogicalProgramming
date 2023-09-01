
public class UnicodeValueOfEachCharacterOfString
{

	public static void main(String[] args)
	{
		String str="JAVA";
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i)+": "+str.codePointAt(i));
		}
	    
	}

}
