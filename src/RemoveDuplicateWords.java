
public class RemoveDuplicateWords {

	public static void main(String[] args) 
	{
		String str="this is is a word of hot hot island";
		String tmp="";
		String[] s=str.split(" ");
		int neg[],k=0;
		for(int i=0;i<s.length;i++)
		{			 
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					s[j]="";
				}	
			}
			tmp=tmp+s[i]+" ";
	
			
		}
		System.out.println(tmp);
		

	}

}
