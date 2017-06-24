import java.io.*;
class sum
{
	public static void main(String[] args)
	{
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the First number ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter the second number ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("The sum is "+ (a+b));
		}
		catch(Exception e)
		{
		}
	}
}