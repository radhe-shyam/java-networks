import java.io.*;
class rev
{
	public static void main(String[] args)
	{
		try
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number : - ");
		int a = Integer.parseInt(br.readLine());
		int n=0;
		while(a != 0)
		{
		n=n*10+a%10;
		a=a/10;	
		}
		System.out.println(n);
		}
		catch(Exception e)
		{}
	}
}