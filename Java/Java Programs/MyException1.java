import java.lang.*;
import java.io.*;
class MyException extends Exception
{
MyException(String message)
{
super(message);
}
}
class MyException1
{
public static void main(String args[])throws Exception
{
int sci[]=new int[100],maths[]=new int[100],eng[]=new int[100],lang[]=new int[100],social[]=new int[100],n;
String name[]=new String[100],regno[]=new String[100];
DataInputStream ob=new DataInputStream(System.in);
try
{
System.out.println("Enter maximum number of students");
n=Integer.parseInt(ob.readLine());
for(int i=0;i<n;i++)
{
System.out.println("Enter Student Name & Reg No");
name[i]=ob.readLine();
regno[i]=ob.readLine();
System.out.println("Enter Student Marks in English Language Maths Science & Social");
eng[i]=Integer.parseInt(ob.readLine());
lang[i]=Integer.parseInt(ob.readLine());
maths[i]=Integer.parseInt(ob.readLine());
sci[i]=Integer.parseInt(ob.readLine());
social[i]=Integer.parseInt(ob.readLine());
if(sci[i]>100||eng[i]>100||lang[i]>100||maths[i]>100||social[i]>100)
{
throw new MyException("Out of range");
}
if(sci[i]<0||eng[i]<0||lang[i]<0||maths[i]<0||social[i]<0)
{
throw new MyException("Negative mark Exception");
}
}
}
catch(MyException e)
{
System.out.println("Caught by exception");
System.out.println(e.getMessage());
}
}
}