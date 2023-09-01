
public class SearchElement {

	public static void main(String[] args)
	{
		int[] a=new int[]{3,6,8,2,1,4,5,10,12,9};
		int search=12;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("At: "+i);
				break;
			}
		}

	}

}
