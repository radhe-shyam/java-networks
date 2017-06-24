import java.io.*;
import java.net.*;
class rit1
{
	public static void main(String[] args) throws Exception
	{
	ServerSocket ss = new ServerSocket(139);
	Socket s = ss.accept();
	DataInputStream i = new DataInputStream(s.getInputStream());
	DataOutputStream o = new DataOutputStream(s.getOutputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true)
	{
		String str;
		System.out.println("Client --> "+ (str = i.readUTF()));
		if(str.equals("quit"))
			break;
		System.out.print("Me --> ");
		str = br.readLine();	
		o.writeUTF(str);
		if(str.equals("quit"))
			break;
	}
	ss.close();
	s.close();
	}
}