class array
{
	int b[],n;
	array(String a[])
	{
	n=a.length;
	b=new int[n];
	for(byte i=0;i<n;i++)
	b[i]=Integer.parseInt(a[i]);
	}
	void dupli()
	{
	for(byte i=0;i<n-1;i++)
		{
		for(int j=i+1;j<n;j++)
			{
			if(b[i]==b[j])
				{
				if(j==n)
					n--;
				else
					{
					for(int k=j+1;k<n;k++)
					b[k-1]=b[k];
					n--;
					j--;
					}
				}
			}
		}
	}
	void disp()
		{
		for(byte i=0;i<n;i++)
			System.out.println(b[i]);
		}
}
class arr
{
	public static void main(String a[])
	{
	array a1=new array(a);
	a1.dupli();
	a1.disp();
	}
}