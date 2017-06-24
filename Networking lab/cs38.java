/*
	This is server side program
*/
import java.io.*;
import java.net.*;
import java.util.*;
class cs38
{
	public static void main(String[] args) throws Exception
	{
	ServerSocket ss = new ServerSocket(139);
	Socket s = ss.accept();
	DataOutputStream o = new DataOutputStream(s.getOutputStream());
	long start = System.currentTimeMillis();
	long end = start + 2 * 1000;
	Random rand = new Random();
	String ser,cli;
	int sum=0;
	while(System.currentTimeMillis() < end)
		{
		int num = rand.nextInt(20);
		sum += num;
		o.writeUTF("" + num);
		}
	o.writeUTF("quit");
	System.out.println("The sum is " + sum);
	}
}
