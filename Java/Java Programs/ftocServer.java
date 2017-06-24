import  java.net.*;
import java.rmi.*;
public   class ftocServer
{
public static void main(String[]args)
{
try
{
ftocImpl f =new ftocImpl();
Naming.rebind("ftoc",f);
System.out.println("Conversion server ready");
}
catch(Exception rex)
{
System.out.println("Exception in AddImpl main:"+rex);
}
/*catch(MalformedUrlException Ex)
{
System.out.println ("MalformedUrlException" +Ex);
}*/
}
}