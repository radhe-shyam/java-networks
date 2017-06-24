import java.io.*;
import java.lang.*;
class Diamond
{
public static void main(String args[])throws IOException
{
int size;
System.out.println("Enter size of the diamond");
DataInputStream a=new DataInputStream(System.in);
size=Integer.parseInt(a.readLine());
for(int i=1;i<size+1;i++)
{
for(int space=0;space<size-i;space++)
System.out.print(" ");
for(int j=i;j>0;j--)
System.out.print("* ");
System.out.println();
}
for(int i=size-1;i>0;i--)
{
for(int spaces=0;spaces<size-i;spaces++)
System.out.print(" ");
for(int j=i;j>0;j--)
System.out.print("* ");
System.out.println();
}
}
}
