import java.net.*;
import java.io.*;
class msgserver
{
	public static void main(String[] args)
	{
	try{
	ServerSocket obj = new ServerSocket(139);
	while(true)
		{
		Socket x = obj.accept();
		DataInputStream d = new DataInputStream(x.getInputStream());
		DataOutputStream o = new DataOutputStream(x.getOutputStream());
		String str = d.readLine();
		o.writeBytes("\n"+str);
		System.out.println("Client message" + str);
		}
	}catch(Exception e)
		{
		System.out.println(e);
		}
	}
}