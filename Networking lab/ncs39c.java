import java.io.*;
import java.net.*;
class ncs39c
{
	public static void main(String[] args) throws Exception
	{
	DatagramSocket ds = new DatagramSocket();
	byte[] recv = new byte[1024];
	InetAddress host = InetAddress.getLocalHost();
	DatagramPacket dp = new DatagramPacket(recv, recv.length);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter any number : ");
	String s = br.readLine();
	ds.send(new DatagramPacket(s.getBytes(),s.length(),host,139));
	ds.receive(dp);
	System.out.println("Factorial is "+(new String(dp.getData())).trim());
	ds.close();
	}	
}