import java.io.*;
class sort
{
	public static void main(String[] args)
	{
	try
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 5 elements");
	int a[] = new int[5];
	for(int i = 0; i < 5; i++)
		 a[i] = Integer.parseInt(br.readLine());
	for(int i = 0; i < a.length-1; i++)
		for(int j = i+1; j < a.length; j++)
		{
		if (a[i] > a[j])
			{
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
	System.out.println("Sorted array");
	for(int i = 0; i < a.length; i++)
		System.out.println(a[i]);
	}
	catch(Exception e){}
	}
}