import java .rmi.*;
import java.io.*;
import java.net.*;
public class AddClient
{
public static   void  main(String args[])
{
try
{
Object o =  Naming.lookup("add");
add Calculator= (add) o;
int f=Calculator.getsum();
System.out.println("the sum is :"+f);
}
/*catch (NetBoundException ex)
{
System.err.println("could not find  the requested  remote object on the server");
}
catch (RemoteException ex)
{
System.err.println("could not find  the requested  remote object on the server");
}*/
catch  (Exception ex)
{
System.err.println("could not find  the requested  remote object on the server");
}
}
}