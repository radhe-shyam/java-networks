import java.io.*;
import java.net.*;
class specific
{
 public static void main(String[] args)
{
	try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter the name of the host : ");
	String s = br.readLine();
	InetAddress ip[] = InetAddress.getAllByName(s);
	for(int i = 0; i < ip.length; i++)
		System.out.println(ip[i]e);
	}catch(Exception e){}
}
}