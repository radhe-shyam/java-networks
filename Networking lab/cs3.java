import java.io.*;
import java.net.*;
class cs3
{
public static void main(String[] args)
{
	try{
	Process p = Runtime.getRuntime().exec("ipconfig");
	BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
	String s;
	while((s = br.readLine()) != null )
		System.out.println(s);
	}catch(Exception e){}
}
}