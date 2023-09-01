import java.util.ArrayList;

public class SecondLargestElementInArray {

	public static void main(String[] args)
	{
		
	     int array[] = {10, 20, 25, 63, 96, 57};
	    	    int first = Integer.MIN_VALUE;
	    	    int second = Integer.MIN_VALUE;

	    	    for(int value : array) {
	    	        if(value > first) {
	    	            second = first;
	    	            first = value;

	    	        } else if(value > second && value != first) {
	    	            second = value;
	    	        }
	    	    }
	    	   System.out.println(second);
	    	}
	}

