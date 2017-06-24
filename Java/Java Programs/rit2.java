import java.io.*;
import java.net.*;
class rit2
{
	public static void main(String[] args) throws Exception
	{
	Socket s = new Socket("127.0.0.1",139);
	DataInputStream i = new DataInputStream(s.getInputStream());
	DataOutputStream o = new DataOutputStream(s.getOutputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true)
	{
		String str;
		System.out.print("Me --> ");
		str = br.readLine();
		o.writeUTF(str);
		if(str.equals("quit"))
			break;
		System.out.println("Server --> " + (str = i.readUTF()));
		if(str.equals("quit"))
			break;
	}
	s.close();
	}
}
