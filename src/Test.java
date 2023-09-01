import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test
{

	public static void main(String[] args)
	{
		int str = test("1aBbT346YM6op");
		System.out.println(str);
	}
	 public static int test(String str) { 
		 int count=0;
		 for(int i=0;i<str.length();i++) {
			 if(Integer.valueOf(str.charAt(i)+"")>0 || Integer.valueOf(str.charAt(i)+"")<9)
				 count++;
		 }
		 return count;
	 }
} 