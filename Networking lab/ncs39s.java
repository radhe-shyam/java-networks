import java.io.*;
import java.net.*;
class ncs39s
{
	public static void main(String[] args) throws Exception
	{
	DatagramSocket ds = new DatagramSocket(139);
	byte[] recv = new byte[1024];
	DatagramPacket rp = new DatagramPacket(recv, recv.length);
	ds.receive(rp);
	String r = fact((new String(rp.getData())).trim());
	ds.send(new DatagramPacket(r.getBytes(),r.length(),rp.getAddress(), rp.getPort()));
	ds.close();  	
	}
	

	public static String fact(String args) throws Exception
	{
	int n = Integer.parseInt(args), sum = 1;
	for(int i = 1;i <= n ; i++)
		sum *= i;
	return ""+sum; 
	}
}