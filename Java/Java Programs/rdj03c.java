/*
	Client side part of Chat program using UDP
	Server side program name : rdj03.java
*/
import java.io.*;
import java.net.*;
class rdj03c
{
	public static void main(String[] args)throws Exception
	{
	DatagramSocket ds = new DatagramSocket();
	byte[] recv = new byte[1024];
	InetAddress host = InetAddress.getLocalHost();
	DatagramPacket dp = new DatagramPacket(recv,recv.length);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s;
	while(true)
		{
			System.out.print("Me --> ");
			s = (br.readLine()).trim();
			ds.send(new DatagramPacket(s.getBytes(),s.length(), host,139));
			if(s.equals("quit"))
				break;
			System.out.print("Server --> ");
			ds.receive(dp);
			if((s = (new String(dp.getData())).trim()).equals("quit"))
				{
				System.out.println(s);
				break;
				}
			System.out.println(s);
		}
	ds.close();
	}
}