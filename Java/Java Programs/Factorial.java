class factorial
{
public static void main(String args[])
{
int f,i,n;
n=Integer.parseInt(args[0]);
f=1;
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("fact of"+n+"is"+f);
}
}
