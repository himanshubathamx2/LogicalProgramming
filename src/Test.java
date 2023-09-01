import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test
{

	public static void main(String[] args)
	{
		test("hello","world");
//		System.out.println(str);
		
	}
	 public static String test(String x,String y){ 
		 x=x+y;//helloworld
		 y=x.substring(0,x.length()-y.length());
		 x=x.substring(y.length());
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(y.codePointAt(0));
		return null;
	 }	
	 
} 