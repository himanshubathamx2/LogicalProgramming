import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test
{
	public static void main(String[] args)
	{
		boolean test = test(90);
		System.out.println(test);
	}
	 public static boolean test(int n){ 
		int result=0;
		result= cal(n);
		while(result!=1) {
			result=cal(result);
		}
		return true;
	 }	
	 
	 public static int cal(int n) {
			int sum=0,d=0;
			 while(n>0) {
				 d=n%10;
				 n=n/10;
				 sum=sum+ d*d;
			 }
		return sum;
	 }
	 
} 