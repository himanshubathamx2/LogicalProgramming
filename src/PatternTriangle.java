
public class PatternTriangle {

	public static void main(String[] args) 
	{
		int n=5;
		int row=n+1;
		
		for(int i=1;i<=6;i++ )
		{
		     if(i<=6/2)
		     {
		    	 for(int j=1;j<=i; j++)
		    	 {   
		    		 System.out.print("*");
		    	 }
		     } 
		     
		     if(i>6/2)
		     {
		    	 for(int k=n;k>=i-1; k--)
		    	 {   
		    		 System.out.print("*");
		    	 }
		     }
		     System.out.println();
		     	 
		}
	}

}
