
public class NoOfVowelsNConsonents {

	public static void main(String[] args) 
	{
		String str="A real weird hot string";
		str=str.toLowerCase();
		int vowels=0,conso=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
			{
				vowels++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
			{
				conso++;
			}
		}
		System.out.println("No. of vowels: "+vowels+" No.of conso: "+conso );
			
		

	}

}
