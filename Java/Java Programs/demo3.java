//Designed to insert an element in an array (First location and second element)
//Designed by Radhe Shyam Jangid
//Date 22/8/2010
class demo3
{
	public static void main(String arg[])
	{
	int a[],i,j,n,r;
	n=arg.length;
	a=new int[n-1];
	for(i=0;i<n-2;i++)
	a[i]=Integer.parseInt(arg[i]);
	int d=Integer.parseInt(arg[n-1]);
	r=Integer.parseInt(arg[n-2])-1;
	for(i=n-2;i<r;i--)
		{
		a[i+1]=a[i];
		}
	a[r]=d;
	System.out.println("New elements are : -");
	for(i=0;i<n-2;i++)
	System.out.println("new ["+i+"]="+a[i]);
	}
}