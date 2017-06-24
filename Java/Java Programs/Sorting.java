import java.io.*;
class Sorting
{
public static void main(String args[])throws IOException
{
DataInputStream r=new DataInputStream(System.in);
System.out.print("Enter The N value:");
int n=Integer.parseInt(r.readLine());
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=Integer.parseInt(r.readLine());
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]<a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Ascending Order:");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}

