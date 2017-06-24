import java.io.*;
import java.net.*;
import java.util.*;
class cserver
{
public static void main(String[] args) throws Exception
	{
	ServerSocket ss = new ServerSocket(139);
	Socket s = ss.accept();
	DataInputStream in = new DataInputStream(new BufferedInputStream(s.getInputStream()));
	DataOutputStream out = new DataOutputStream(s.getOutputStream());
	System.out.println(in.readUTF());
	out.writeUTF("hello");	
	s.close();
	ss.close();
	
	}
}