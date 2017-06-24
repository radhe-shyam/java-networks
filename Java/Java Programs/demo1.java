//Designed to sort an array
//Designed by Radhe Shyam Jangid
//Date 22/8/2010
class demo1
{
	public static void main(String arg[])
		{
		int a[],n,i,t,j;
		n=arg.length;
		a=new int[n];
		for(i=0;i<n;i++)
		a[i]=Integer.parseInt(arg[i]);
		for(i=0;i<n;i++)		
			{
			for(j=i;j<n;j++)
				{
				if(a[i]>a[j])
					{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					}
				}
			}
		for(i=0;i<n;i++)
		System.out.println(a[i]);
		}
}