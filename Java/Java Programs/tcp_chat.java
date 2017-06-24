import java.io.*;
import java.net.*;
class client
{
	public static void main(String[] args) throws Exception
	{
	Socket s = new Socket("127.0.0.1",139);
	DataOutputStream o = new DataOutputStream(s.getOutputStream());
	DataInputStream i = new DataInputStream(s.getInputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String c,s1;
	while(true)
	{
		o.flush();
		if((s1 = i.readUTF()).equals("quit"))
		{
			System.out.println("Server--> " + s1);
			break;
		}
		System.out.println("Server--> " + s1);
		System.out.print("Me--> ");
		if((c = br.readLine()).equals("quit"))
		{
			o.writeUTF(c);
			break;
		}
		o.writeUTF(c);
	}
	s.close();
	}
}

class server
{
	public static void main(String[] args) throws Exception
	{
	ServerSocket ss = new ServerSocket(139);
	Socket s = ss.accept();
	DataOutputStream o = new DataOutputStream(s.getOutputStream());
	DataInputStream i = new DataInputStream(s.getInputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String c,s1;
	while(true)
	{
		o.flush();
		System.out.print("Me--> ");
		if((s1 = br.readLine()).equals("quit"))
		{
		o.writeUTF(s1);
		break;
		}
		o.writeUTF(s1);
		if((c = i.readUTF()).equals("quit"))
		{
		System.out.println("Client--> " + c);
		break;
		}
		System.out.println("Client--> " + c);
	}
	ss.close();
	s.close();
	}
}