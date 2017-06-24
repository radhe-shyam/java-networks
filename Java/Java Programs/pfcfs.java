/**radhe shyam jangid*/
import java.io.*;
class stack{
	char a[];
	int top,pf;
	stack()throws IOException
{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the numbers of blocks in memory : - ");
		int x=Integer.parseInt(br.readLine());
		a=new char[x];
		pf=0;
		top=0;
		}
	void push(char x){
	if(top==a.length)
		{
		//System.out.println("value pushed when stack is overflow");
		for(byte i=0;i<a.length-1;i++)
			a[i]=a[i+1];
		a[top-1]=x;
		disp();	
		pf++;
		}
	else
		{
		//System.out.println("normal pushing");
		a[top]=x;
		disp();
		pf++;
		top++;
		}
	}
	void check(char x){
	if(top==0)
		{
		//System.out.println("Check if true");
		push(x);
		}
	else
		{
		for(byte i=0;i<top;i++)
			{
			if(a[i]==x)
				{
				//System.out.println("value found return to main");
				return;
				}
			}
		//System.out.println("value not found, now pushed at top of the stack");
		push(x);
		}
	}
	void disp(){
	for(byte i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	System.out.println();
	}
}
public class pfcfs{
	public static void main(String a[])throws IOException{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter string : -");
	String rj=r.readLine();
	stack s=new stack();
	for(int i=0;i<rj.length();i++)
		s.check(rj.charAt(i));	
	System.out.println("Page fault : "+s.pf);
	}
}