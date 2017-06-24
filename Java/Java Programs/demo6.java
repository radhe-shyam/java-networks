class sort
	{
	void s(String arg[])
		{
		int n=arg.length;
		for(int i=0;i<n-1;i++)
			{
			for(int j=i;j<n;j++)
				{
				String c=strc(arg[i],arg[j]);
				if(c==arg[j])
					{
					String d=arg[i];
					arg[j]=arg[i];
					arg[i]=d;
					}
				}
			}
		for(byte i=0;i<n;i++)
			System.out.println(arg[i]);	
		}
	String strc(String a, String b)
		{
		String e="Radhe";
		if(a.length()<b.length())
					{
					for(int k=0;k<a.length();k++)
						{
						if(a.charAt(k)!=b.charAt(k))
							{
							if(a.charAt(k)>b.charAt(k))
								e=b;
							else
								e=a;
							}
						}
					}
		else
					{
					for(int k=0;k<b.length();k++)
						{
						if(a.charAt(k)!=b.charAt(k))
							{
							if(a.charAt(k)>b.charAt(k))
								e=b;
							else
								e=a;
							}
						}
					}
		return e;
		}
	}
class demo6
{
public static void main(String arg[])
	{
	sort ob=new sort();
	ob.s(arg);	
	}
	
}