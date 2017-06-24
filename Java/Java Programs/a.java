import java.io.*;
import java.net.*;
class a
{
	public static void main(String[] args) throws Exception
	{
	ServerSocket ss = new ServerSocket(139);
	Socket s = ss.accept();
	DataInputStream in = new DataInputStream(new BufferedInputStream(s.getInputStream()));
	//BufferedReader br =  new BufferedReader(new InputStreamReader(s.getInputStream()));
	//while(true)
	System.out.println(in.readLine());
//	ss.close();
//	s.close();
	}
}