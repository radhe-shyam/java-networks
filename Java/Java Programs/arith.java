import java.io.*;
interface ari
{
DataInputStream ob=new DataInputStream(System.in);
void add();
void sub();
void mul();
void div();
}
class asd implements ari
{
int x,y;
public void get()
{
try
{
System.out.println("Enter Integer Values:");
x=Integer.parseInt(ob.readLine());
y=Integer.parseInt(ob.readLine());
}
catch (Exception e)
{
}
}
public void add()
{
System.out.println("add="+(x+y));
}
public void sub()
{
System.out.println("sub="+(x-y));
}
public void mul()
{
System.out.println("mul="+(x*y));
}
public void div()
{
System.out.println("div="+(x/y));
}
}
class asd1 implements ari
{
float x1,y1;
public void get()
{
try
{
System.out.println("Enter Float Values:");

x1=Float.parseFloat(ob.readLine());
y1=Float.parseFloat(ob.readLine());
}
catch (Exception e)
{
}
}
public void add()
{
System.out.println("add="+(x1+y1));
}
public void sub()
{
System.out.println("sub="+(x1-y1));
}
public void mul()
{
System.out.println("mul="+(x1*y1));
}
public void div()
{
System.out.println("div="+(x1/y1));
}
}
class arith
{
public static void main(String args[])
{
asd r1=new asd();
asd1 r2=new asd1();
ari refer;
refer=r1;
r1.get();
refer.add();
refer.sub();
refer.mul();
refer.div();
refer=r2;
r2.get();
refer.add();
refer.sub();
refer.mul();
refer.div();
}
}

