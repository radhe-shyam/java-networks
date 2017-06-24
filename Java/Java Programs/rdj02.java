/*
Chat program using TCP
This is server side program
*/
import java.io.*;
import java.net.*;
class rdj02
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