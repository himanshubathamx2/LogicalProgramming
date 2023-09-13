
public class PrimeOrNot {

	public static void main(String[] args)
	{
		boolean prime = prime(12);
		System.out.println(prime);
	}
	
	public static boolean prime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
