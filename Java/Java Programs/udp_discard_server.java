import java.io.*;
import java.util.*;
import java.net.*;
class server
{
	public static void main(String[] a) throws Exception
	{
	DatagramSocket ss = new DatagramSocket(139);
	byte[] r = new byte[65536];
	DatagramPacket dp = new DatagramPacket(r, r.length);
	while(true)
		{
		ss.receive(dp);
		System.out.println(dp.getAddress() + " at Port " + dp.getPort() + " says : " + (new String(dp.getData())).trim());
		}
	}
}
class client
{
	public static void main(String[] args) throws Exception
	{
	DatagramSocket ss = new DatagramSocket();
	byte[] r = new byte[65536];
	InetAddress host = InetAddress.getLocalHost();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter the String : ");
	String s = br.readLine();
	ss.send(new DatagramPacket(s.getBytes(), s.length(),host,139));
	}
}