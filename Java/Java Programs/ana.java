import java.io.*;
import java.util.*;
class ana
{
	public static void main(String[] args) throws Exception
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter two string");
	String s1 = br.readLine();
	String s2 = br.readLine();
	if(s1.length()!=s2.length())
		{
		System.out.println("Not Anagram");
		System.exit(0);
		}
	for(int i=0;i<s1.length();i++)
		{
		for(int j=0;j<s2.length();j++)
			{
			/*if((s1.charAt(i)!=s2.charAt(j)) && j==s2.length()-1)
				{
				System.out.println("Not Anagram");
				System.exit(0);	
				}*/
			if(s1.charAt(i)==s2.charAt(j))
				break;
			else if(j == s2.length()-1)
				{
				System.out.println("Not Anagram");
				System.exit(0);	
				}
				
			}
		}
	System.out.println("Anagram");
	}
}