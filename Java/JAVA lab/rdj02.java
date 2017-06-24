import java.io.*;
import java.net.*;
class rdj02
{
	public static void main(String[] args) throws Exception
	{
	ServerSocket ss = new ServerSocket(139);
	Socket s = ss.accept();
	DataInputStream i = new DataInputStream(s.getInputStream());
	DataOutputStream o = new DataOutputStream(s.getOutputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String ser,cli;
	while(true)
	{
		o.flush();
		System.out.print("Me --> ");
		if((ser = br.readLine()).equals("quit"))
			{
			o.writeUTF(ser);
			break;
			}
		o.writeUTF(ser);
		if((cli=i.readUTF()).equals("quit"))
			{
			System.out.println("Client --> " + ser);
			break;
			}
		System.out.println("Client --> " + cli);
		
	}
	}
}