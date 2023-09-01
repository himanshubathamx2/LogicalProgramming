
public class RemoveGivenWordFromString
{

	public static void main(String[] args)
	{
		String str="This is holy madness";
		String word="holy";
		
		str=str.replaceAll(word, "");
		str=str.replaceAll("  "," ");
		System.out.println(str);
		
		
		

	}

}
