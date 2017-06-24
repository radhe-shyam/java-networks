import java.io.*;
public class Stringfun2
{
public static void main(String args[])throws IOException
{
String s1,s2;
int n,z;
DataInputStream str=new DataInputStream(System.in);
do
{
System.out.println(" 1:Compare \n 2:Concat \n 3:Get Character \n 4:Uppercase \n 5:Substring \n 6.Replace \n 7:Get a character/string at specified Position");
System.out.println("Enter Your choice:");
n=Integer.parseInt(str.readLine());
switch(n)
{
case 1:
{
System.out.println("Enter String 1 & 2:");
s1=str.readLine();
s2=str.readLine();
if(s1.equals(s2))
{
System.out.println("Equal");
}
else
System.out.println("Not Equal");
break;
}
case 2:
{
System.out.println("Enter String 1 & 2:");
s1=str.readLine();
s2=str.readLine();
System.out.println(s1.concat(s2));
break;
}
case 3:
{
System.out.println("Enter String 1 & 2:");
s1=str.readLine();
s2=str.readLine();
int m;
System.out.println("Enter a postion to find a character");
m=Integer.parseInt(str.readLine());
System.out.println(s1.charAt(n));
System.out.println(s2.charAt(n));
break;
}
case 4:
{
System.out.println("Enter String 1 & 2:");
s1=str.readLine();
s2=str.readLine();
System.out.println(s1.toUpperCase());
System.out.println(s2.toUpperCase());
break;
}
case 5:
{
System.out.println("Enter String 1 & 2:");
s1=str.readLine();
s2=str.readLine();
int m,l;
System.out.println("Enter a start and end postion to extract a string");
m=Integer.parseInt(str.readLine());
l=Integer.parseInt(str.readLine());
System.out.println(s1.substring(m,l));
System.out.println(s2.substring(m,l));
}
case 6:
{
System.out.println("Enter String 1 & 2:");
s1=str.readLine();
s2=str.readLine();
String str1,str2;
System.out.println("Enter a letter to replace");
str1=str.readLine();
System.out.println("Enter a letter to be replaced");
str2=str.readLine();
System.out.println(s1.replace(str1,str2));
System.out.println(s2.replace(str1,str2));
break;
}
case 7:
{
System.out.println("Enter String 1 & 2:");
s1=str.readLine();
s2=str.readLine();
String str1,str2;
System.out.println("Enter a letter to get 1st string position");
str1=str.readLine();
System.out.println("Enter a letter to get 2nd string position");
str2=str.readLine();
System.out.println(s1.indexOf(str1));
System.out.println(s2.indexOf(str2));
break;
}
default:
{
System.out.println("Error");
}
}
System.out.println("Enter 1 to continue 0 To Discard:");
z=Integer.parseInt(str.readLine());
}
while(z==1);
}
}
