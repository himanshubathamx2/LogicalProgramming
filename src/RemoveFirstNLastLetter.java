
public class RemoveFirstNLastLetter
{

	public static void main(String[] args)
	{
		String s="pjavaq";
		String real="";
		char[] ch=s.toCharArray();
		for(int i=1;i<ch.length-1;i++)
		{
			real =real+ch[i];
		}
		System.out.println(real);

	}

}
