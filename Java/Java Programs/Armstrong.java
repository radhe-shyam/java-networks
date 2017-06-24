import java.io.*;
class armstrong
{
public static void main(String args[])
{
int a=0,b,c,d,n=0;
n=Integer.parseInt(args[0]);
c=n;
while(n!=0)
{
b=n%10;
a=a+(b*b*b);
n=n/10;
}
if(a==c)
{
System.out.println("Armstrong number");
}
else
System.out.println("Not a armstrong number");
}
}

