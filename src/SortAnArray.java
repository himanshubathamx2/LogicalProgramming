
public class SortAnArray {

	public static void main(String[] args)
	{
		System.out.println("begin");
		int a[]= {2,5,7,11,4,10};
		int size=a.length;
		int tmp=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
