
public class PatternTriangle2 {

	public static void main(String[] args)
	{
		int n=20;// user will enter odd no.(max astrick in row )
		int row=n+1,x=1,y=n;
		for(int i=1;i<=row;i++ )
		{
		     if(i<=row/2)
		     {
		    	 for(int j=1;j<=x; j++)
		    	 {   
		    		 System.out.print("*");		    		 
		    	 }
		    	 x=x+2;
		     } 		  
		     if(i>row/2)
		     {
		    	 for(int k=y;k>=1; k--)
		    	 {   
		    		 System.out.print("*");
		    	 }
		    	 y=y-2;
		     }
		     System.out.println();

	}

	}}
