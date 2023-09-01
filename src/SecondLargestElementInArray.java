import java.util.ArrayList;

public class SecondLargestElementInArray {

	public static void main(String[] args)
	{
		 int temp, size;
	     int array[] = {10, 20, 25, 63, 96, 57};
	      
	      //sorting the array
	      size = array.length;
	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++)
	         {
	        	   if(array[i]>array[j])
	        	   {
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;     
	               }
	         }
	      }
	      
	      for(int i=0;i<array.length;i++)
	      {
	    	  System.out.println(array[i]);
	      }
	      System.out.println("second largest number is:: "+array[size-2]);

	}

}
