/*
	Server part of RMI program
*/
import java.rmi.*;
import java.net.*;
public class rdj07
{
public static void main(String[] args) throws Exception
	{
	rdj06 obj =  new rdj06();
	Naming.rebind("Variance",obj);
	System.out.print("Variance server is ready..");
	}
}