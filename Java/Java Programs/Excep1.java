import java.io.*;
public class Excep
{
static double f1,f2;
public static void read() throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
try
{
System.out.println("enter two marks");
f1=Double.parseDouble(ob.readLine());
f2=Double.parseDouble(ob.readLine());
}
catch(NumberFormatException e)
{
throw e;
}
}
public static void calculate() throws ArithmeticException
{
if(f2==0)
throw new ArithmeticException();
System.out.println("quos:"+f1/f2);
}
public static void main(String args[])
{
try
{
read();
calculate();
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("Execute again and try");
}
}
}
