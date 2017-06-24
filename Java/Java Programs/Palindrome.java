class Palindrome
{
public static void main(String pali[])
{
string a="MMM",c;
int i,j,b=1;
while(a[b]!='\0')
{
b++;
}
j=b;
for(i=0;i<=b;i++)
{
c[j]=a[i];
j--;
}
c[b+1]='\0';
if(a==c)
{
System.out.print("Its a palindrome");
}
}
}
