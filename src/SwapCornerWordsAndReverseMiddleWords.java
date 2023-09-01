
public class SwapCornerWordsAndReverseMiddleWords
{

	public static void main(String[] args)
	{
		String str="Give Any Kind Of String";
		
		String tmp="";
		String[] s=str.split(" ");
        //swap
		tmp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=tmp;
	    String fin=s[0]+" ";
	 for(int i=1;i<s.length-1;i++)
	 {
		 fin =fin+swap(s[i])+" ";
	 }
		fin=fin+s[s.length-1];
		System.out.println(fin);
	}
	
	public static String swap(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String fin=sb.toString();
		return fin;
	}

}
