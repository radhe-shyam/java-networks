import java.io.*;
class MPL
{
	int standard,nos,scrs[];
	BufferedReader br;
	MPL(int nos,int standard)
	{
		try
		{
		scrs = new int[nos];
		this.standard = standard;
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Marks for " + nos + " students : ");
		for(int i = 0; i < nos; i++ )
			scrs[i] = Integer.parseInt(br.readLine());
		}
		catch(Exception e){}
	}	
	public int totMark()
	{
		int sum=scrs[0];
		for(int i = 1; i < scrs.length; i++)
			sum+=scrs[i];
		return sum;
	}
}
class MPLMain
{
	public static void main(String[] args)
	{
	try 
		{
		MPL obj[] = new MPL[10];
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		for( int i = 0; i < 10; i++)
			{
			System.out.println("Enter the number of student of standard " + (i+1));
			obj[i] = new MPL(Integer.parseInt(br.readLine()),i+1);
			}
		int max = obj[0].totMark();
		int stan = 1;
		for(int i = 1; i < 10; i++)
			{
			if (obj[i].totMark() > max)
				{
				max = obj[i].totMark();
				stan = i+1;
				}
			}
		System.out.println("The best standard is " + stan +" with " + max + " marks.");	
		}
		catch(Exception e){}
	}
}