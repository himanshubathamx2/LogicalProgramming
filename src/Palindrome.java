
public class Palindrome
{

	public static void main(String[] args)
	{    
	    palindrome(1221);
	   
	   
	   
	}

	public static void palindrome(int no) {
		int d,d1;
	    String rev="";
	    int n=1221;
	    while(n!=0)
	  {	
	    d=n%10;
	    rev=rev+d;
	    n=n/10;
	  }
	    
	   int n1=(int)Integer.parseInt(rev);
	  
	   if(n1==no)
	   {
		   System.out.println("Palindrome");
	   }
	   else
	   {
		   System.out.println("Not a palindrome");
	   }
	}
	
	
	
}
