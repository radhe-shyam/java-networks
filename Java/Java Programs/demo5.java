//Designed to delete the duplicate elements from an array
//Designed by Radhe Shyam Jangid
//Date 22/8/2010
class demo5
{
	public static void main(String arg[])
	{
	int a[],n;
	n=arg.length;
	a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=Integer.parseInt(arg[i]);
	for(int i=0;i<n-1;i++)
		{
		for(int j=i+1;j<n;j++)	
			{
			if(a[i]==a[j])
				{
				if(j==n)
					n--;
				else
					{
					for(int k=j+1;k<n;k++)
						a[k-1]=a[k];
					n--;
					j--;
					}
				}
				
			}
		}
	for(int i=0;i<n;i++)
	System.out.println(a[i]);
	}
}
