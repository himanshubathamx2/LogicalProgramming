
public class StringWordsRev {

	public static void main(String[] args)
	{
		String str="durga is a boy";
		String[] str1= str.split(" ");
		String final2="";
		
		for(int i=0;i<str1.length;i++)
		{
			final2=final2+ StringWordsRev.rev(str1[i]);
		}
		
		System.out.println(final2);
		
	}
	
	public static String rev(String s)
	{
		char[] ss=s.toCharArray();
		char[] tmp=new  char[ss.length];
		int n=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			tmp[n]=ss[i];
			n++;
		}
		String finall =new String(tmp);
		return " "+finall;
	}


}
