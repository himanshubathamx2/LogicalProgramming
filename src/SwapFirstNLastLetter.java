
public class SwapFirstNLastLetter
{
	public static void main(String[] args)
	{
		String s="pjavaq";
//		char tmp=0;
//		char[] ch=s.toCharArray();
//		char c1=ch[0];
//		char c2=ch[ch.length-1];
//		tmp=ch[0];
//		ch[0]=ch[ch.length-1];
//		ch[ch.length-1]=tmp;
//		String ss=new String(ch);
//		System.out.println(ss);
		
		char c1=s.charAt(0);
		char c2=s.charAt(s.length()-1);
		char tmp=0;
		tmp= c1;
		c1=c2;
		c2=tmp;
		s= c1+s.substring(1,s.length()-1)+c2;
		System.out.println(s);
	}
}
