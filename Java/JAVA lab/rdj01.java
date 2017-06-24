import java.io.*;
import java.net.*;
class rdj01
{
	public static void main(String[] args) throws Exception
	{
	Socket s = new Socket("127.0.0.1",139);
	DataInputStream i = new DataInputStream(s.getInputStream());
	DataOutputStream o = new DataOutputStream(s.getOutputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String ser,cli;
	while(true)
	{
		o.flush();
		if((ser=i.readUTF()).equals("quit"))
			{
			System.out.println("Server --> " + ser);
			break;
			}
		System.out.println("Server --> " + ser);
		System.out.print("Me --> ");
		if((cli = br.readLine()).equals("quit"))
			{
			o.writeUTF(cli);
			break;
			}
		o.writeUTF(cli);
	}
	}
}