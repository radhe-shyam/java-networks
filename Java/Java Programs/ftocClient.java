import java .rmi.*;
import java.io.*;
import java.net.*;
public class ftocClient
{
public static   void  main(String args[])
{
try
{
Object o =  Naming.lookup("ftoc");
ftoc temp= (ftoc) o;
System.out.print("Enter the temperature in celsius : ");
//Scanner s = new Scanner(System.in);
float f=temp.getftoc();
System.out.println("the conversion is :"+f);
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