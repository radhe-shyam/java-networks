import java.io.*;
import java.net.*;
class client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1",1309);
        FileWriter fw = new FileWriter("rdj.txt");
	DataInputStream din = new DataInputStream(s.getInputStream());
        String str=din.readUTF();
        fw.write(str);
	System.out.print("File downloaded Successfully.");
	fw.close();
        s.close();
    }
}
class server
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(1309);
        Socket s = ss.accept();
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
       	BufferedReader br = new BufferedReader(new FileReader("rdj1.txt"));
        String str = "", str1 = "";
        while(!((str1 = br.readLine()) == null ))
		str +=	str1 + "\n"; 	
	dout.writeUTF(str);
        br.close();
        s.close();
        ss.close();
    }
    
}
