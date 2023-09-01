import java.util.Scanner;

public class Padding
{

	public static void main(String[] args)
	{
		System.out.println("Enter String that is to be padded");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter padding character");
		char ch=sc.nextLine().charAt(0);
		System.out.println("Total length of string");
		int l=sc.nextInt();
		
		//left padding
		String fin="";
		int slen=str.length();
		int padneedlen=l-slen;
	    for(int i=1;i<=padneedlen;i++)
	    {
	    	fin=fin + ch;
	    }
	    fin=fin+str;
	    System.out.println(fin);
	    
	    
	    
	    //right padding
	    String fin1="";
	    int slen1=str.length();
	    int padneedlen1=l-slen1;
	    fin1=fin1+str;
	    for(int i=1;i<=padneedlen1;i++)
	    {
	    	fin1=fin1+ch;
	    }
	    System.out.println(fin1);
	    
	    
	    
	    //center padding
	    String fin2="";
	    int slen2=str.length();
	    int padneedlen2=l-slen2;
	    int divide= padneedlen2/2;
	    for(int i=1;i<=divide;i++)
	    {
	    	fin2=fin2+ch;
	    }
	    fin2=fin2+str;
	    for(int i=1;i<=divide;i++)
	    {
	    	fin2=fin2+ch;
	    }
	    System.out.println(fin2);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
