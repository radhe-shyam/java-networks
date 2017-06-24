/*
Chat program using TCP
This is client side program
*/
import java.io.*;
import java.net.*;
class rdj01
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