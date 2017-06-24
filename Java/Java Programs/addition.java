import pack1.operation;
import java.io.*;
class addition
{
public static void main(String args[])throws IOException
{
operation f=new operation();
DataInputStream ob=new DataInputStream(System.in);
int q,w;
System.out.println("Enter Two Values:");
q=Integer.parseInt(ob.readLine());
w=Integer.parseInt(ob.readLine());
f.add(q,w);
f.sub(q,w);
f.mul(q,w);
}
}

