import java.io.*;
import java.net.*;
class cncs1
{
	public static void main(String[] args) throws Exception
	{
	InetAddress a = InetAddress.getByName("phc.prontonetworks.com");
	//for(int i=0; i < a.length();i++)
	System.out.println(a.getHostName());
	}
}