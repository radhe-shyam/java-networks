//Designed to check frquency of an element in an array
//Last string is element
//Designed by Radhe Shyam Jangid
//Date 22/8/2010
class demo4
{
	public static void main(String arg[])
	{
	int a[],i,n,r=0;
	n=arg.length;
	a=new int[n-1];	
	int d=Integer.parseInt(arg[n-1]);
	for(i=0;i<n-1;i++)
	a[i]=Integer.parseInt(arg[i]);
	for(i=0;i<n-1;i++)
	{
	if(d==a[i])
	r++;
	}
	System.out.println("Frequency of "+d+" is "+r);
	}
}