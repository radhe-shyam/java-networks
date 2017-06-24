//Designed to delete an element from an array(last is element)
//Designed by Radhe Shyam Jangid
//Date 22/8/2010
class demo2
{
	public static void main(String arg[])
	{
	int a[],i,j,n,r=1;
	n=arg.length;
	int d=Integer.parseInt(arg[n-1]);
	a=new int[n-1];
	for(i=0;i<n-1;i++)
	a[i]=Integer.parseInt(arg[i]);
	for(i=0;i<n-1;i++)
		{
		if(d==a[i])
			if(i==n-2)
			{
			r++;
			break;
			}
			else
			{
			for(j=i;j<n-2;j++)
			a[j]=a[j+1];
			i--;
			r++;
			}
		}
	System.out.println("New elements are : -");
	for(i=0;i<n-r;i++)
	System.out.println("new ["+i+"]="+a[i]);
	}
}