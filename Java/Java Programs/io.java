import java.io.*;
class io
{
	public static String ip() throws Exception
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
		}
	public static void op(String str)
	{
	System.out.print(str);
	}
	public static void opn(String str)
	{
	System.out.println(str);
	}
}