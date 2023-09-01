
public class SnakeCaseToCamel
{

	public static void main(String[] args)
	{
		String snake="this is war";
		
		char tmp=0;
		String ww="";
		String[] s=snake.split(" ");
		for(int i=0;i<s.length;i++)
		{
			
			char[] ch=s[i].toCharArray();
			ch[0]=(""+ch[0]).toUpperCase().charAt(0);
			char c1=s[i].charAt(0);
			s[i]=s[i].replace(c1, ch[0]);
		}
		
		for(int i=0;i<s.length;i++)
		{
			ww=ww+s[i]+" ";
		}
		System.out.println(ww);
		
		
	
		
			
	}

}
