
public class SwappingTwoStrings
{

	public static void main(String[] args)
	{   
		//using third var
		String s1="abc";
		String s2="defg";
		String tmp="";
		tmp=s1;
		s1=s2;
		s2=tmp;
		System.out.println("s1: "+s1+" s2: "+s2);
		
			//without using third var(just like we swap two no.s)
		   String a = "Hello";
	       String b = "World";	
	       a = a + b;
	       b = a.substring(0,a.length()-b.length());
	       a = a.substring(b.length());
	       System.out.println("a: "+a+" b: "+b);
		

	}

}
