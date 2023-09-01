
public class SwappingPairsOfCharacters
{

	public static void main(String[] args)
	{
		String str="thisIsHalloweenMCx";//
		//if odd thn last letter shud be written as it is javac--> ajavc 
		
		char[] ch=str.toCharArray();
		char tmp=0;
		
		
		for(int i=0;i<ch.length;i++)
		{
			tmp=ch[i];
			try {
			ch[i]=ch[i+1];
			}catch(ArrayIndexOutOfBoundsException e)
			{
				break;
			}
			ch[i+1]=tmp;
			i++;
			
			
		}
		
		String s=new String(ch);
		System.out.println(s);

	}

}
