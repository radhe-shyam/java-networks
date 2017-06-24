import java.io.*;
import java.util.*;
class cs95
{
	public static void main(String[] args) throws Exception
	{
	Scanner br = new Scanner(new File("rdj.txt"));
	PrintWriter op = new PrintWriter(new File("rdj1.txt"));
	io.op("Enter the string 1 : ");
	String ds, s, n="", ss=io.ip();
	io.op("Enter the string 2 : ");
	ds = io.ip();
	while(br.hasNext())
		{
		s = br.nextLine();
		 n = n + s.replaceAll(ss,ds) + "\r\n";
		}
	op.printf("%s",n);
	op.close();
	br.close();
	io.opn("Text replaced and saved in new file.");
	}
}