import java.io.*;
class cmd
{
	public static void main(String[] args) throws Exception
	{
	Process p = Runtime.getRuntime().exec("ipconfig");
	BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
	String s;
	while((s=br.readLine())!=null)
	System.out.println(s);
	}
}