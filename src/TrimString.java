
public class TrimString
{

	public static void main(String[] args)
	{
		//triming only leading and trailing whitespaces
		String str="   Hello     Hi  Tunnu  					  hello  ";
		str=str.trim();
		
		//single space
		str=str.replaceAll("\\s+"," ");
		System.out.println(str);
		
	    //no space
		//str=str.replaceAll("\\s+"," ");
		//System.out.println(str);
		
		
		
	}

}
