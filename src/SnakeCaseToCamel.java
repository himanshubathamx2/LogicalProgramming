
public class SnakeCaseToCamel
{

	public static void main(String[] args)
	{
		String str = test("this_is_war");
		System.out.println(str);
	}
	 public static String test(String str) { 
		 String[] s= str.split("_");
		 String res=s[0];
		 for(int i=1;i<s.length;i++) {
			 res= res+  (s[i].charAt(0)+"").toUpperCase()+s[i].substring(1);
		 }
		 return res;
	 }

}
