
public class SwapFirstNLastLetter
{

	public static void main(String[] args)
	{
		String s="pjavaq";
		
		char tmp=0;
		char[] ch=s.toCharArray();
		char c1=ch[0];
		char c2=ch[ch.length-1];
		tmp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=tmp;
		String ss=new String(ch);
		System.out.println(ss);
        
        
	}

}
