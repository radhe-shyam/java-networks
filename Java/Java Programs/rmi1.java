import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.util.*;
interface i extends Remote	//Interface part
{
	public String enc(String n) throws RemoteException;
}

class imp extends UnicastRemoteObject implements i	//Implementation part of interface
{
	public imp() throws RemoteException
	{
	super();
	}
	public String enc(String n) throws RemoteException
	{
		return "bandar";
	}
}

class s	//server part
{
	public static void main(String[] args) throws Exception
	{
	imp obj = new imp();
	Naming.rebind("hehe",obj);
	System.out.print("Server is ready...");
	}
}

class c	//Client part
{
	public static void main(String[] args) throws Exception
	{
	Object ob = Naming.lookup("hehe");
	i obj = (i)ob;
	System.out.println(obj.enc("tada"));
	}
}

c:\> javac rmi.java
c:\> start rmiregistry
c:\> rmic imp
c:\> start java s
c:\> java c