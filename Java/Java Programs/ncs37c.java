/*
	Client side part of encoding program using UDP
	Server side program name : ncs37s.java
*/
import java.io.*;
import java.net.*;
class ncs37c
{
	public static void main(String[] args)throws Exception
	{
	DatagramSocket ds = new DatagramSocket();
	byte[] recv = new byte[1024];
	InetAddress host = InetAddress.getLocalHost();
	DatagramPacket dp = new DatagramPacket(recv,recv.length);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter message : ");
	String s = br.readLine();
	ds.send(new DatagramPacket(s.getBytes(),s.length(), host,139));
			ds.receive(dp);
			System.out.println("Encoded message : " +(new String(dp.getData())).trim());
	ds.close();
	}
}