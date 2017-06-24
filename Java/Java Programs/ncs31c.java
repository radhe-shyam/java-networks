import java.io.*;
import java.net.*;
import java.util.*;
class Client1
{
            public static void main(String args[]) throws Exception
            {
                        DatagramSocket client=new DatagramSocket();
                        InetAddress addr=InetAddress.getByName("127.0.0.1");
                        byte[] rb=new byte[1024];
                        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Enter the String:");
                        String str=in.readLine();
                        client.send(new DatagramPacket(str.getBytes(),str.length(),addr,1309));
                        DatagramPacket r=new DatagramPacket(rb,rb.length);
                        client.receive(r);
                        String s=new String(r.getData());
                        System.out.println(s.trim());   
                        client.close();
            }
}
