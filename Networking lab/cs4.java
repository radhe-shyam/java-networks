import java.io.*;
import java.net.*;
class cs4
{
public static void main(String[] args)
{
	try{
	InetAddress p = InetAddress.getLocalHost();
	System.out.println(p.getHostAddress() + p.getHostName());
	}
	catch(Exception e){ }
}
}