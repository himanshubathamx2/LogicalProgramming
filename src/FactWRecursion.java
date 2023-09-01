public class FactWRecursion {

    public static void main(String[] args) 
    {
     int num=4;
     int factorial =fact(num);
     System.out.println(factorial);   
    }	
    
    
    public static int fact(int num)
    {
    	if(num>=1)
    	return num*fact(num-1);
    	else
    		return 1;
    }
	}