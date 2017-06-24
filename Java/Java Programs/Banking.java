import java.io.*;
import java.lang.*;
abstract class Bankaccount
{ 
String cname[]=new String[100],dob[]=new String[100],address[]=new String[100];
int accno[]=new int[100],bal[]=new int[100],m;
DataInputStream ob=new DataInputStream(System.in);
void getdata()
{
try
{
System.out.println("Enter m value");
m=Integer.parseInt(ob.readLine());
for(int i=0;i<m;i++)
{
System.out.println("Enter customer name");
cname[i]=ob.readLine();
System.out.println("Enter your D.O.B");
dob[i]=ob.readLine();
System.out.println("Enter address");
address[i]=ob.readLine();
System.out.println("Enter Account No:");
accno[i]=Integer.parseInt(ob.readLine());
System.out.println("Enter Balance:");
bal[i]=Integer.parseInt(ob.readLine());
}
}
catch(Exception e)
{
}
}
void display()
{
try
{
for(int i=0;i<m;i++)
{
System.out.println("Customer name"+cname[i]);
System.out.println("D.O.B"+dob[i]);
System.out.println("Address"+address[i]);
System.out.println("Account No:"+accno[i]);
System.out.println("Balance:"+bal[i]);
}
}
catch(Exception e)
{
}
}
}
class Savingsaccount extends Bankaccount
{
void option()
{
try
{
int cust,n,witdra,depo;
System.out.println("1.Withdraw \n 2.Deposit \n 3.Delete \n 4.Create");
n=Integer.parseInt(ob.readLine());
System.out.println("Enter your accout number");
cust=Integer.parseInt(ob.readLine());
for(int i=0;i<m;i++)
{
if(accno[i]==cust)
{
switch(n)
{
case 1:
System.out.println("Enter the amount to withdraw");
witdra=Integer.parseInt(ob.readLine());
System.out.println("Balance:"+(bal[i]-witdra));
break;
case 2:
System.out.println("Enter Deposit amount");
depo=Integer.parseInt(ob.readLine());
System.out.println("Balance:"+(bal[i]+depo));
break;
case 3:
System.out.println("Enter The Account Number to Delete:");
int h=Integer.parseInt(ob.readLine());
if(accno[i]==h)
{
accno[i]=0;
System.out.println("Account Has Been Deleted");
}
else
System.out.println("Invalid account number");
break;
case 4:
System.out.println("Enter customer name");
cname[n+1]=ob.readLine();
System.out.println("Enter your D.O.B");
dob[n+1]=ob.readLine();
System.out.println("Enter address");
address[n+1]=ob.readLine();
System.out.println("Enter Account No:");
accno[n+1]=Integer.parseInt(ob.readLine());
System.out.println("Enter Balance:");
bal[n+1]=Integer.parseInt(ob.readLine());
m=m+1;
break;
default:
System.out.println("Invalid Selection");
}
}
}
}
catch(Exception e)
{
}
}
}
public class Banking
{
public static void main(String args[])throws IOException
{
Savingsaccount s1=new Savingsaccount();
Bankaccount ref;
Savingsaccount ref1;
ref=s1;
ref.getdata();
ref.display();
ref1=s1;
ref1.option();
}
}
