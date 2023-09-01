
public class CheckIfStringContainsOnlyDigits
{

	public static void main(String[] args)
	{
		String str="12g";
		Integer i=0;
		try 
		{
		 i=Integer.valueOf(str);
		 System.out.println("Only digits: "+i);
		}
		catch(NumberFormatException e)
		{
			System.out.println("String contains other things too ");
		}
		

	}

}
