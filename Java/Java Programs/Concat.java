import java.io.*;
import java.lang.*;
class Concat
{
public static void main(String args[])throws Exception
{
File outfile=new File("outfile.txt");
FileInputStream f1=new FileInputStream("text1.txt");
FileInputStream f2=new FileInputStream("text2.txt");
SequenceInputStream in=new SequenceInputStream(f1,f2);
try
{
FileWriter out=new FileWriter(outfile);
int ch;
while((ch=in.read())!=-1)
{
out.write((char)ch);
}
System.out.println("File is merged");
in.close();
out.close();
f1.close();
f2.close();
}
catch(Exception e)
{
System.out.println("Error");
}
}
}
