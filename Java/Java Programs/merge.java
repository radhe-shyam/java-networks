import java.io.*;
public class merge
{
	public static void main(String a[])throws Exception
	{
	DataInputStream dis=new DataInputStream(System.in);
	System.out.println("enter the name of the first file");
	String s=dis.readLine();
	FileInputStream f1=new FileInputStream(s);
	System.out.println("enter the name of the secondfile");
	s=dis.readLine();
	FileInputStream f2=new FileInputStream(s);
	System.out.println("enter the name of the destinationfile");
	s=dis.readLine();
	FileOutputStream f3=new FileOutputStream(s);
	int x;
	while((x=f1.read())!=-1)
	f3.write(x);
	f2.close();
	f3.close();
	System.out.println("file created successfully");
	}
}
