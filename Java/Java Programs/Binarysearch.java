import java.io.*;
import java.lang.*;
class Binarysearch
{
public static void main(String args[])throws IOException
{
int temp,n,top,bottom,middle,search;
DataInputStream ob=new DataInputStream(System.in);
System.out.println("Enter the array size");
n=Integer.parseInt(ob.readLine());
int a[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter a["+i+"]");
a[i]=Integer.parseInt(ob.readLine());
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("After Sorting");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
top=n-1;
bottom=0;
System.out.println("Enter a element to search");
search=Integer.parseInt(ob.readLine());
while(bottom<=top)
{
middle=(top+bottom)/2;
if(search==a[middle])
{
System.out.println("Element is found at "+middle+" Position");
System.exit(0);
}
else if(search<a[middle])
{
top=middle-1;
}
else if(search>a[middle])
{
bottom=middle+1;
}
}
System.out.println("Element is not found");
}
}
