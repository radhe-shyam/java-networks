import java.io.*;
public class customer
{
public static void main(String a[])throws Exception
{
DataInputStream dis=new DataInputStream(System.in);
File f=new File("customer.txt");
FileInputStream fi;
DataInputStream ds;
FileOutputStream fo;
PrintStream ps=System.out;
String name="",number="",s="";
while(true)
{
ps.println("1.add 2.search with name 3.search with number 4.exit");
ps.println("enter the option");
int op=Integer.parseInt(dis.readLine());
switch(op)
{
case 1:ps.println("enter the name and number");
name=dis.readLine();
number=dis.readLine();
s=name+"-"+number+"\n";
s=s.toUpperCase();
fo=new FileOutputStream(f,true);
fo.write(s.getBytes());
fo.close();
break;
case 2:ps.println("enter the name to search");
name=dis.readLine();
fi=new FileInputStream(f);
ds=new DataInputStream(fi);
ds=new DataInputStream(fi);
while((s=ds.readLine())!=null)
{
name=name.toUpperCase();
if(s.indexOf(name)!=-1)
ps.println(s);
}
ds.close();
fi.close();
break;
case 3: ps.println("enter the number to search");
number=dis.readLine();
fi=new FileInputStream(f);
ds=new DataInputStream(fi);
while((s=ds.readLine())!=null)
{
if(s.indexOf(number)!=-1)
ps.println(s);
}
ds.close();
fi.close();
break;
case 4:System.exit(0);
break;
default:ps.println("invalid option");
}
}
}
}