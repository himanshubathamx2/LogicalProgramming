import java.util.Scanner;

public class PatternSquare {

	public static void main(String[] args) 
	{
		square(10,10);
	}
	
	public static void square(int row, int col)
	{
	  for(int i=1;i<=row;i++)
	  {
		  for(int j=1;j<=col;j++)
		  {
			  if((i==1 || j==1) ||  (i==row || j==col) )
			  {
				  System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
			  
		  }
		  System.out.println();
	  }
	}

}
