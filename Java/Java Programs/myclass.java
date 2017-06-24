class myclass
{
 static void fact(int b)
{
 int sum=1;
 for(int i=1;i<=b;i++)
 {
 sum=sum*i;
 }
 System.out.println("factorial is ="+sum);
 }
 static void table(int b)
{
 System.out.println("table of="+b);
for(int i=1;i<=10;i++)
System.out.println((b*i));
}
}
class a50
{
 public static void main(String ar[])
 {
 int b=Integer.parseInt(ar[0]);
 myclass.fact(b);
 myclass.table(b);
 }
}