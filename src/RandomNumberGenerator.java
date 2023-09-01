import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {

	public static void main(String[] args)
	{   
		//Method 1: random() method
		//it generates a double type no. between 0.0-1.0
		System.out.println(Math.random());
		//Math.random() * (max - min + 1) + min  .In the above formula, the min value is inclusive while the max value is exclusive.
		//Generate random double value from 200 to 400  
		double a = Math.random()*(400-200+1)+200;   
		System.out.println(a);// typecast to int if needed
		
		
		//Method 2: using the random class
		Random r=new Random();
		int n=r.nextInt(10);//give max range(exclusive) in breaces
		System.out.println(n);
	
		//3:java.util.concurrent.ThreadLocalRandom
		int a1 = ThreadLocalRandom.current().nextInt();
		System.out.println(a1);
		int b1=ThreadLocalRandom.current().nextInt(10, 1000);// (oirigin, bound)
		System.out.println(b1);
		
		//4: using inits:In Java 8, a new method ints() has been added to the Random class.
		Random random = new Random();  
		random.ints(5).forEach(System.out::println);//method that generates a stream of integers having size 5  
		System.out.println("Seprator");
		random.ints(9, 50, 90).forEach(System.out::println);//method that generates a stream of 9 integers between 50 to 90  
		
		
		
	}

}
