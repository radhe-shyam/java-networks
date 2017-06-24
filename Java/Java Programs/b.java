import java.io.*;
import java.net.*;
class b
{
	public static void main(String[] args) throws Exception
	{
	Socket s = new Socket("127.0.0.1",139);
	DataOutputStream rd = new DataOutputStream(s.getOutputStream());
	//while(true)
	rd.writeUTF("Hone do dil ko fanna");
	
//s.close();
	}
}