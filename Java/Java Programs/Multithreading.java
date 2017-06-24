import java.io.*;
import java.lang.*;
class MyThread extends Thread
{
int x;
String s;
public MyThread(int i,String s1)
{
x=i;
s=s1;
start();
}

public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(s+i+"*"+x+"="+i*x);
}
} }
public class Multithreading
{
public static void main(String args[])throws IOException
{
int a,b,c;
System.out.println("Enter any 3 nos to get their multiplication table");
DataInputStream ob=new DataInputStream(System.in);
a=Integer.parseInt(ob.readLine());
b=Integer.parseInt(ob.readLine());
c=Integer.parseInt(ob.readLine());
MyThread m1=new MyThread(a,"");
MyThread m2=new MyThread(b,"\t ");
MyThread m3=new MyThread(c,"\t\t ");
}
}

