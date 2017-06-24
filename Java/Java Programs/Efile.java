import java.io.*;
public class Efile
{
public static void main(String args[])
{
try
{
DataInputStream ob= new DataInputStream(System.in);
System.out.println("enter the  file name");
String s =ob.readLine();
File f=new File(s);
if(f.isDirectory())
{
String s1[]=f.list();
System.out.println("files in the directory...");
for(int i=0;i<s1.length;i++)
System.out.println(s1[i]);
}
else if(f.isFile())
{
System.out.println("Size of the file:"+f.length());
System.out.println("last modified on:"+f.lastModified());
System.out.println("ReadOnly:"+!f.canRead());
System.out.println("writeonly:"+!f.canWrite());
System.out.println("hiddent:"+f.isHidden());
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}

