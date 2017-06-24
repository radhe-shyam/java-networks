/*
	Server side program of encoding program using UDP
	Client program name : ncs37c.java
*/
import java.io.*;
import java.net.*;
class ncs37s
{
	public static void main(String[] args) throws Exception
	{
	DatagramSocket ds = new DatagramSocket(139);
	byte[] recv = new byte[1024];
	DatagramPacket rp = new DatagramPacket(recv, recv.length);
		ds.receive(rp);
		String s = (new String(rp.getData())).trim(), r="";
		for(int i=0; i < s.length(); i++)
		{
			char a = s.charAt(i);
			if(a == 'z') a='a';
			if(a =='Z') a='A';
			a++;
			r = r + a;
		}
		ds.send(new DatagramPacket(r.getBytes(),r.length(),rp.getAddress(),rp.getPort()));
	ds.close();
	}
}