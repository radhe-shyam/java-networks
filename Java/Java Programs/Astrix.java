class Astrix
{
public static void main(String args[])
{
System.out.print("\t"+"\t"+"*"+"\n");
for(int i=1;i<2;i++)
{
for(int j=1;j<=i;j++)
{
for(int k=1;k<=j;k++)
{
System.out.print("\t"+"*");
}
System.out.print("\t"+"\t"+"*");
System.out.println();
}
System.out.println("*"+"\t"+"\t"+"*"+"\t"+"\t"+"*");
}
for(int i=1;i<2;i++)
{
for(int j=1;j<=i;j++)
{
for(int k=1;k<=j;k++)
{
System.out.print("\t"+"*");
}
System.out.print("\t"+"\t"+"*");
System.out.println();
}
System.out.print("\t"+"\t"+"*"+"\n");
}
}
}
