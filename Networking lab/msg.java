import java.net.*;
import java.io.*;
class client
{
	public static void main(String[] args)
	{
	try{
	BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
	Socket x = new Socket("127.0.0.1",139);
	DataInputStream d = new DataInputStream(x.getInputStream());
	DataOutputStream o = new DataOutputStream(x.getOutputStream());
	System.out.print("Enter Message");
	String str = b.readLine();
	o.writeBytes(str+"\n");
	String check = d.readLine();
//	System.out.println("Message is "+check);
	x.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
