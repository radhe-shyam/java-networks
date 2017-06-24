import java.io.*;
class Increase
{
public static void main(String args[])throws IOException
{
int n;
DataInputStream a=new DataInputStream(System.in);
System.out.print("Enter value of n"+"\t");
n=Integer.parseInt(a.readLine());
for(int i=0;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}
