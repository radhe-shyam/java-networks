import  java.net.*;
import java.rmi.*;
public   class AddServer
{
public static void main(String[]args)
{
try
{
AddImpl f =new AddImpl();
Naming.rebind("add",f);
System.out.println("Addition server ready");
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