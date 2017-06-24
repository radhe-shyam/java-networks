/*
	Server side program of TCP chat program using UDP
	Client program name : rdj03c.java
*/
import java.io.*;
import java.net.*;
class rdj03
{
	public static void main(String[] args) throws Exception
	{
	DatagramSocket ds = new DatagramSocket(139);
	byte[] recv = new byte[1024];
	DatagramPacket rp = new DatagramPacket(recv, recv.length);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true)
		{
		String s;
		System.out.print("Client --> ");
		ds.receive(rp);
		if((s = (new String(rp.getData())).trim()).equals("quit"))
			{
			System.out.println(s);
			break;
			}
		System.out.println(s);
		System.out.print("Me --> ");
		s = br.readLine();
		ds.send(new DatagramPacket(s.getBytes(),s.length(),rp.getAddress(),rp.getPort()));
		if(s.equals("quit"))
			break;
		}
	ds.close();
	}
}