//Assignment#3
//Designed to display the string with Upper case, Proper case and lower case
//Designed by Radhe shyam Jangid
//Date 17/8/2010
class demo
	{
	public static void main (String arg[])
		{
		int n,n1,d=0,b=0,s=0,j,i;
		char a;
		n=arg.length;
		for(i=0;i<n;i++)
			{
			n1=arg[i].length();
			for(j=0;j<n1;j++)
				{
				a=arg[i].charAt(j);
                		if((a>'0') && (a<='9'))
                		d++;
                		else if (((a>='a') && (a<='z')) || ((a>='A') && (a<='Z')))
                			{
					b++;
					}
                		else
                		s++;
				}
			}
		System.out.print("These string has "+d +" digits, "+b +" alphabets  and "+s +" special characters");
		}
	}

//Output: -
