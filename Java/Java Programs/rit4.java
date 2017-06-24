import java.io.*;
import java.net.*;
class rit4
{
	public static void main(String[] args) throws Exception
	{
	DatagramSocket s =  new DatagramSocket();
	byte[] rcv;
	DatagramPacket dp;
	InetAddress host = InetAddress.getLocalHost();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true)
		{
		String str;
		rcv = new byte[1024];
		dp = new DatagramPacket(rcv,rcv.length);
		System.out.print("Me --> " );
		str = br.readLine();
		s.send(new DatagramPacket(str.getBytes(),str.length(),host, 139));
		if(str.equals("quit"))
			break;
		s.receive(dp);
		System.out.println("Server --> " + (str = (dp.getData().trim())));
		if(str.equals("quit"))
			break;
		}	
	}
}