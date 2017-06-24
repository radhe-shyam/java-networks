/*
	This is client side program
*/
import java.io.*;
import java.net.*;
class cs38c
{
	public static void main(String[] args) throws Exception
	{
	Socket s = new Socket("127.0.0.1",139);
	DataInputStream i = new DataInputStream(s.getInputStream());
	String ser,cli;
	int sum=0;
	while(!(ser=i.readUTF()).equals("quit"))
			sum += Integer.parseInt(ser);
	System.out.println("The sum is " + sum);
	}
}