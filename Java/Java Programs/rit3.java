import java.io.*;
import java.net.*;
class rit3
{
	public static void main(String[] args) throws Exception
	{
	DatagramSocket s = new DatagramSocket(139);
	byte[] rcv =  new byte[1024];
	DatagramPacket dp = new DatagramPacket(rcv,rcv.length);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true)
		{
		String str;
		
		
		s.receive(dp);
		System.out.print("Client --> " + (str = (dp.getData()).trim()));
		if(str.equals("quit"))
			break;
		System.out.print("Me --> ");
		str = br.readLine();
		s.send(new DatagramPacket(str.getBytes(), str.length(),dp.getAddress(), dp.getPort()));
		if(str.equals("quit"))
			break;		
		}
	s.close();
	}
}