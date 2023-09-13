
public class PermutationOfAString
{
	static int count=0;
	public static void main(String[] args)
	{
		permutation("abcd");
	}

	public static void permutation(String s) {
		permutee(s, "");
	}
	public static void permutee(String s, String prefix) {
		if(s.length()==0)
			System.out.println(prefix);
		else {
			for(int i=0;i<s.length();i++) {
				String rem= s.substring(0,i)+ s.substring(i+1);
				permutee(rem, prefix+ s.charAt(i));
			}
		}
	}
}
