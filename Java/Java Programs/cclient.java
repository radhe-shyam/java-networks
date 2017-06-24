import java.io.*;
import java.net.*;
import java.util.*;
class cclient
{
	public static void main(String[] args) throws Exception
	{
	Socket s = new Socket("127.0.0.1",139);
	DataOutputStream out = new DataOutputStream(s.getOutputStream());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DataInputStream in = new DataInputStream(new BufferedInputStream(s.getInputStream()));
	out.writeUTF(br.readLine());
	System.out.println(in.readUTF());
	s.close();
	}
}