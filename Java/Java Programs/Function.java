import java.io.*;
public class Function
{
public static int wordCount(String s)
{
int wc=0;
char c =s.charAt(0),c1='\0';
for(int i=0;i<s.length();i++)
{
c1=s.charAt(i);
if((c!=c1)&&(c1==' '||c1=='\t'||c1=='\n'||c1=='.'))
{
wc++;
c=c1;
}
}
return(wc);
}
public static String arrayToString(char c[])
{
return new String(c);
}
public static char mostFrequent(String s)
{
        int f[]=new int[s.length()];
for(int i=0;i<s.length();i++)
{
  char d=s.charAt(i);
       int x=s.indexOf(String.valueOf(d));
  if(x==i)
     f[x]=1;
  else
    f[x]++;
}
  int big=0;
  for(int i=1;i<s.length();i++)
  {
    if(f[big]<f[i])
      big=i;
  }
 return s.charAt(big);
}
public static String replace(String s1,String s2,String s3)
{
int x=0,y=s3.length();
while((x=s1.indexOf(s2))>-1)
{
StringBuffer sb=new StringBuffer(s1);
sb.replace(x,x+y,s3);
s1=sb.toString();
}return(s1);
}
public static void main(String args[]) throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
System.out.println("enter a string");
String s1=ob.readLine();
System.out.println("number of words:"+wordCount(s1));
char c[]={'j','a','v','a'};
System.out.println("Array of string:"+arrayToString(c));
System.out.println("enter a string:");
s1=ob.readLine();
System.out.println("most frequent occuring char:"+mostFrequent(s1));
System.out.println("enter a string");
s1=ob.readLine();
System.out.println("enter the stringn to replace");
String s2=ob.readLine();
System.out.println("enter the new String to replace");
String s3=ob.readLine();
System.out.println("replaced String:"+replace(s1,s2,s3));
}
}
