import java.io.*;
import java.lang.*;
class Stringbuff
{
public static void main(String args[])throws IOException
{
String str,str1;
int a,n,yes;
DataInputStream in=new DataInputStream(System.in);
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("Enetr a String to perform operation");
str=ob.readLine();
StringBuffer str2=new StringBuffer(str);
System.out.println(" 1.Append a string \n 2.Reverse a string \n 3.Insert a String");
System.out.println("Enter your Choice");
n=Integer.parseInt(ob.readLine());
switch(n)
{
case 1:
System.out.println("Enter a String to append");
str1=ob.readLine();
System.out.println(str2.append(str1));
break;
case 2:
System.out.println(str2.reverse());
break;
case 3:
System.out.println("Enter a Position to insert a character");
a=Integer.parseInt(in.readLine());
System.out.println("Enter a character or string to insert");
str1=ob.readLine();
System.out.println(str2.insert(a,str1));
break;
default:
System.out.println("Invalid Selection");
}
System.out.println("Enter 1 to continue or 0 to discard");
yes=Integer.parseInt(ob.readLine());
}
while(yes==1);
}
}

